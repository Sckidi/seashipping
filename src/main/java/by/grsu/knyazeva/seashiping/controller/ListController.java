package by.grsu.knyazeva.seashiping.controller;

import by.grsu.knyazeva.seashiping.form.OrderForm;
import by.grsu.knyazeva.seashiping.model.Consignment;
import by.grsu.knyazeva.seashiping.model.Customer;
import by.grsu.knyazeva.seashiping.model.Order;
import by.grsu.knyazeva.seashiping.model.User;
import by.grsu.knyazeva.seashiping.repository.OrderRepository;
import by.grsu.knyazeva.seashiping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/list")
public class ListController {
  @Autowired
  public OrderRepository orderRepository;
  @Autowired
  public UserRepository userRepository;

  @GetMapping
  public String getListPage(Model model) {
    model.addAttribute("myOrders", orderRepository.findAllByCustomer_Username(getCurrentUser().getUsername()));
    return "list";
  }

  @GetMapping("/{id}")
  public String getCardById(@PathVariable("id") Long id, Model model) {
    Order order = orderRepository.findById(id).orElseThrow(NullPointerException::new);
    OrderForm orderForm = map(order.getCustomer(), order.getConsignment());
    model.addAttribute("form", orderForm);
    return "cart";
  }
  @GetMapping("/del/{id}")
  public String deleteCardById(@PathVariable("id") Long id, Model model) {
    orderRepository.deleteById(id);
    return "list";
  }

  private User getCurrentUser() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    return userRepository.findByUsername(auth.getName());
  }

  private OrderForm map(Customer aCustomer, Consignment aConsignment) {
    OrderForm orderForm = new OrderForm();
    if (aConsignment != null) {
      orderForm.setConsignmentAmount(aConsignment.getAmount());
      orderForm.setConsignmentShippingDate(aConsignment.getShippingDate());
      orderForm.setConsignmentShippingPlace(aConsignment.getShippingPlace());
      orderForm.setProduct(aConsignment.getProduct());
    }
    if (aCustomer != null) {
      orderForm.setCustomerAddress(aCustomer.getAddress());
      orderForm.setCustomerCompanyName(aCustomer.getCompanyName());
      orderForm.setCustomerContactPerson(aCustomer.getContactPerson());
      orderForm.setCustomerPhoneNumber(aCustomer.getPhoneNumber());
      orderForm.setCustomerRegistrationNumber(aCustomer.getRegistrationNumber());
    }
    return orderForm;
  }
}

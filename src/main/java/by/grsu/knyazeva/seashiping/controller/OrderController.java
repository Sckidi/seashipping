package by.grsu.knyazeva.seashiping.controller;

import by.grsu.knyazeva.seashiping.form.OrderForm;
import by.grsu.knyazeva.seashiping.form.RegisterForm;
import by.grsu.knyazeva.seashiping.model.Consignment;
import by.grsu.knyazeva.seashiping.model.Customer;
import by.grsu.knyazeva.seashiping.model.Order;
import by.grsu.knyazeva.seashiping.model.User;
import by.grsu.knyazeva.seashiping.model.constants.Products;
import by.grsu.knyazeva.seashiping.repository.ConsignmentRepository;
import by.grsu.knyazeva.seashiping.repository.CustomerRepository;
import by.grsu.knyazeva.seashiping.repository.OrderRepository;
import by.grsu.knyazeva.seashiping.repository.UserRepository;
import org.apache.catalina.session.JDBCStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.krb5.internal.ccache.FileCredentialsCache;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ConsignmentRepository consignmentRepository;
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public String getOrderPage(Model model) {
        model.addAttribute("form", new OrderForm());
        model.addAttribute("products", Products.values());
        model.addAttribute("currentUser", getCurrentUser());
        return "order";
    }

    @PostMapping
    public String addOrder(@ModelAttribute("form") OrderForm orderForm, Model model) {

        Order order = new Order();
        Customer customer = customerRepository.findByRegistrationNumber(orderForm.getCustomerRegistrationNumber());
        if(customer == null){
            customer = new Customer();
            customer.setAddress(orderForm.getCustomerAddress());
            customer.setCompanyName(orderForm.getCustomerCompanyName());
            customer.setContactPerson(orderForm.getCustomerContactPerson());
            customer.setRegistrationNumber(orderForm.getCustomerRegistrationNumber());
            customer.setUsername(getCurrentUser().getUsername());
            customer.setPhoneNumber(orderForm.getCustomerPhoneNumber());
            customerRepository.save(customer);
        }
        Consignment consignment = new Consignment();
        consignment.setAmount(orderForm.getConsignmentAmount());
        consignment.setProduct(orderForm.getProduct());
        consignment.setShippingDate(orderForm.getConsignmentShippingDate());
        consignment.setShippingPlace(orderForm.getConsignmentShippingPlace());
        consignmentRepository.save(consignment);
        order.setConsignment(consignment);
        order.setCustomer(customer);
        orderRepository.save(order);
        model.addAttribute("addedSuccessful", true);
        return "order";
    }

    private User getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return userRepository.findByUsername(auth.getName());
    }
}

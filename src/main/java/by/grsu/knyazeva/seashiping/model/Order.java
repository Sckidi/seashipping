package by.grsu.knyazeva.seashiping.model;

import by.grsu.knyazeva.seashiping.model.constants.Products;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "_order")
public class Order implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "customer_id", nullable = false)
  private Customer customer;
  @ManyToOne
  @JoinColumn(name = "consignment_id", nullable = false)
  private Consignment consignment;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer aCustomer) {
    customer = aCustomer;
  }

  public Consignment getConsignment() {
    return consignment;
  }

  public void setConsignment(Consignment aConsignment) {
    consignment = aConsignment;
  }

  @Override
  public String toString() {
    return "Заказ № " + id +
      ", Заказчик: " + customer.getCompanyName() +
      ", Партия № " + consignment.getId();
  }
}

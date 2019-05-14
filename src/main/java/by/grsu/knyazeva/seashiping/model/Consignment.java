package by.grsu.knyazeva.seashiping.model;

import by.grsu.knyazeva.seashiping.model.constants.Products;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
//Заказ
public class Consignment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    private Products product;
    private LocalDate shippingDate;
    private Long amount;
    private String shippingPlace;
    private Compartment compartment;
    private String registrationNumber;
    private boolean  paid;
    @OneToMany(mappedBy="consignment")
    private List<Order> orders;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getShippingPlace() {
        return shippingPlace;
    }

    public void setShippingPlace(String shippingPlace) {
        this.shippingPlace = shippingPlace;
    }

    public Compartment getCompartment() {
        return compartment;
    }

    public void setCompartment(Compartment compartment) {
        this.compartment = compartment;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> aOrders) {
        orders = aOrders;
    }
}

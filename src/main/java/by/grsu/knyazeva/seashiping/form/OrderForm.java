package by.grsu.knyazeva.seashiping.form;

import by.grsu.knyazeva.seashiping.model.constants.Products;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class OrderForm {
    private Products product;
    private Long consignmentAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate consignmentShippingDate;
    private String consignmentShippingPlace;
    private String customerCompanyName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerContactPerson;
    private String customerRegistrationNumber;

    public String getCustomerRegistrationNumber() {
        return customerRegistrationNumber;
    }

    public void setCustomerRegistrationNumber(String aCustomerRegistrationNumber) {
        customerRegistrationNumber = aCustomerRegistrationNumber;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Long getConsignmentAmount() {
        return consignmentAmount;
    }

    public void setConsignmentAmount(Long consignmentAmount) {
        this.consignmentAmount = consignmentAmount;
    }

    public LocalDate getConsignmentShippingDate() {
        return consignmentShippingDate;
    }

    public void setConsignmentShippingDate(LocalDate consignmentShippingDate) {
        this.consignmentShippingDate = consignmentShippingDate;
    }

    public String getConsignmentShippingPlace() {
        return consignmentShippingPlace;
    }

    public void setConsignmentShippingPlace(String consignmentShippingPlace) {
        this.consignmentShippingPlace = consignmentShippingPlace;
    }

    public String getCustomerCompanyName() {
        return customerCompanyName;
    }

    public void setCustomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerContactPerson() {
        return customerContactPerson;
    }

    public void setCustomerContactPerson(String customerContactPerson) {
        this.customerContactPerson = customerContactPerson;
    }
}

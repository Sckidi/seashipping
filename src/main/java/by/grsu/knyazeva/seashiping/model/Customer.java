package by.grsu.knyazeva.seashiping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//Покупатель
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String registrationNumber;
    private String companyName;
    private String address;
    private String phoneNumber;
    private String activityField;
    private String contactPerson;
    private String login;
    private String password;
}

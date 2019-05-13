package by.grsu.knyazeva.seashiping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
//Склад
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)private Long id;
    private String address;
    private String phoneNumber;
    private String managerName;

}

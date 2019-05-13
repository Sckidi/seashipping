package by.grsu.knyazeva.seashiping.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
//Партия
public class Consignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "сonsignment")
    private Collection<Product> products = new ArrayList<>();
    private LocalDate shippingDate;
    private Long amount;
    private String weight;
    private String shippingPlace;
    private Compartment compartment;
    private String registrationNumber;
    private boolean  paid;
}

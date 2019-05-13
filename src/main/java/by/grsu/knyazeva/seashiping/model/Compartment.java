package by.grsu.knyazeva.seashiping.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
//Отсек
public class Compartment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Stock stock;
    @OneToMany(mappedBy = "compartment")
    private Collection<Product> products = new ArrayList<>();
}

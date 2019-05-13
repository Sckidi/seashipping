package by.grsu.knyazeva.seashiping.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//Товар
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String manufacturer;
    private String shelfLife;
    @ManyToOne
    @JoinColumn(name="compartment_id", nullable=false)
    private Compartment compartment;
    @ManyToOne
    @JoinColumn(name="сonsignment_id", nullable=false)
    private Consignment сonsignment;
}

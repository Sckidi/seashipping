package by.grsu.knyazeva.seashiping.model;

import by.grsu.knyazeva.seashiping.model.constants.FlightType;
import by.grsu.knyazeva.seashiping.model.constants.ShipType;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
//Рейс
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    private FlightType flightType;
    private String shippingPlace;
    private LocalDate shippingDate;
    private LocalTime shippingTime;
    @Enumerated
    private ShipType shipType;
    private Double cost;
}

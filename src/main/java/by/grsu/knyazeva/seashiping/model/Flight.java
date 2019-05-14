package by.grsu.knyazeva.seashiping.model;

import by.grsu.knyazeva.seashiping.model.constants.FlightType;
import by.grsu.knyazeva.seashiping.model.constants.ShipType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
//Рейс
public class Flight implements Serializable {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public String getShippingPlace() {
        return shippingPlace;
    }

    public void setShippingPlace(String shippingPlace) {
        this.shippingPlace = shippingPlace;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public LocalTime getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(LocalTime shippingTime) {
        this.shippingTime = shippingTime;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}

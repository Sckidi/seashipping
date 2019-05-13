package by.grsu.knyazeva.seashiping.model.constants;

public enum FlightType {
    PERMANENT("постоянный"),
    CHARTER("чартерный"),
    STATE_ORDER("госзаказ");

    private String description;

    FlightType(String description) {
        this.description = description;
    }
}

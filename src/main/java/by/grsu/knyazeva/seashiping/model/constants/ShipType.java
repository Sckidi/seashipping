package by.grsu.knyazeva.seashiping.model.constants;

public enum ShipType {
    HIGHLY_SPECIALIZED("доставка только определенного типа груза"),
    SPECIALIZED("доставка двух или более типов грузов одной категории"),
    DOUBLE_SPECIALIZED("транспортировка грузов разных категорий"),
    MULTIPURPOSE("перевозка грузов разных категорий, с возможностью перегрузки горизонтальным и вертикальным способом"),
    UNIVERSAL("универсальные (перевозки любых грузов)");

    private String description;

    ShipType(String description) {
        this.description = description;
    }
}
package by.grsu.knyazeva.seashiping.model.constants;

public enum Products {
    CIGARETTES("Сигареты","Табак-Инвест", "4 года"),
    ALCOHOL("Алкоголь","Дубаи Крышталь", "2 года"),
    CHOCOLATE("Шоколад","Милка-Инвест", "1 год"),
    ELECTRONICS("Электроника","SamSung Inc", "5 лет"),
    FISH("Рыба","Santa Bremor", "1 год"),
    CARS("Автомобили","Geely", "10 лет"),
    FURNITURE("Мебель","ПинскДрев", "4 года"),
    INSTRUMENTS("Инструменты","Bosh", "4 года"),
    MEAT("Говядина","Неман", "1 год"),
    COFFEE("Кофе","Nescafe", "2 года"),
    OIL("Масло","Нафтан", "3 года");

    Products(String name, String manufacturer, String shelfLife) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.shelfLife = shelfLife;
    }

    private String name;
    private String manufacturer;
    private String shelfLife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }
}

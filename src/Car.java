public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int productionYear;
    private final double engineVolume;
    private final String productionCountry;

    public Car(String brand, String model, String color, int productionYear, double engineVolume, String productionCountry) {
        this.brand = brand;
        this.color = color;
        this.engineVolume = engineVolume;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    void carInfo(){
        System.out.println("Машина - " + brand + " " + model + ", " + productionYear + " года выпуска, страна производства " + productionCountry + ", цвет - " + color + ", объём двигателя  - " + engineVolume + " литров.");
    }
}

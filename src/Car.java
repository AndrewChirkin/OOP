public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int productionYear;
    private final double engineVolume;
    private final String productionCountry;

    public Car(String brand, String model, String color, int productionYear, double engineVolume, String productionCountry) {
        if (brand == null) {
          this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        }else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }


    }
    void carInfo(){
        System.out.println("Машина - " + brand + " " + model + ", " + productionYear + " года выпуска, страна производства " + productionCountry + ", цвет - " + color + ", объём двигателя  - " + engineVolume + " литров.");
    }
}

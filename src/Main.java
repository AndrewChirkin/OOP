public class Main {
    public static void main(String[] args) {
        Car LadaGranta = new Car("Lada", "Granta", "жёлтый", 2015, 1.7,"Россия");
        Car AudiA8 = new Car("Audi", "A8 50 L TDI quattro", "чёрный", 2020, 3.0,"Германия");
        Car BMWz8 = new Car("BMW", "Z8", "чёрный", 2021, 3.0,"Германия");
        Car KiaSportage4 = new Car("Kia", "Sportage 4-го поколения", "красный", 2018, 2.4,"Южная Корея");
        Car HyundaiAvante = new Car("Hyundai", "Avante", "оранжевый", 2016, 1.6,"Южная Корея");
        LadaGranta.carInfo();
        AudiA8.carInfo();
        BMWz8.carInfo();
        KiaSportage4.carInfo();
        HyundaiAvante.carInfo();

    }
}
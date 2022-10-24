public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Granta", "жёлтый", 2015, 1.7,"Россия");
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", "чёрный", 2020, 3.0,"Германия");
        Car BMW = new Car("BMW", "Z8", "чёрный", 2021, 3.0,"Германия");
        Car Kia = new Car("Kia", "Sportage 4-го поколения", "красный", 2018, 2.4,"Южная Корея");
        Car Hyundai = new Car("Hyundai", "Avante", "оранжевый", 2016, 1.6,"Южная Корея");
        Lada.carInfo();
        Audi.carInfo();
        BMW.carInfo();
        Kia.carInfo();
        Hyundai.carInfo();

    }
}
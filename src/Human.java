public class Human {
    private final int yearOfBitrh;
    private final String name;
    private final String town;
    public Human(String name, String town, int yearOfBitrh){
        this.name = name;
        this.town = town;
        this.yearOfBitrh = yearOfBitrh;
    }
    void greeting(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBitrh + " году. Будем знакомы!");
    }
}

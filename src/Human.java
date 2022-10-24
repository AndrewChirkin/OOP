public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;
    private final String jobTitle;
    public Human(String name, String town, int yearOfBirth, String jobTitle){
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;

    }
    void greeting(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}

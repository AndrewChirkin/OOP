public class Human {
    private int yearOfBirth;
    private final String name;
    private final String town;
    private final String jobTitle;
    public Human(String name, String town, int yearOfBirth, String jobTitle){

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }

        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle == null) {
            this.jobTitle = "Инфорация не указана";
        }else {
            this.jobTitle = jobTitle;
        }


    }
    void greeting(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}

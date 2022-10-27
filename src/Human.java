import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;
    private  String town;
    private String jobTitle;
    private int Age;

    public Human(String name, String town, int yearOfBirth, String jobTitle){
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth() {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            yearOfBirth = 0;
        }
    }
    public int setAge(){
        return this.Age = LocalDate.now().getYear() - yearOfBirth;
    }
        public String getName(){
                return name;
            }
        public void setName(String name){
            if(name != null && !name.isEmpty() && !name.isBlank()){
                this.name = name;
            }else {
                System.out.println("Информация не указана");
        }
        }
        public String getTown(){
                return town;
            }
        public void setTown(String town){
            if(town != null && !town.isEmpty() && !town.isBlank()){
                this.town = town;
            }else {
                System.out.println("Информация не указана");
        }
        }
        public String getJobTitle(){
            return jobTitle;
        }
        public void setJobTitle(String jobTitle){
            if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()){
                this.jobTitle = jobTitle;
            }else{
                System.out.println("Я безработный(ая)");
            }
        }





    void greeting(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
    void helloVladimir(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Мне " + setAge() + " лет. Я нигде не работаю сейчас. Будем знакомы!");
    }
}

package humains;

public abstract class Humain {
    
    //Attributs
    String gender; 
    String firstname;
    String lastname;
    int age;
    double hight;
    double weight;

    //Constructeur
    public Humain(String gender, String firstname, String lastname, int age, double hight, double weight) {
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }

    // Méthodes 
    public void viewDetails (){
        System.out.println("My name is " + firstname + " " + lastname + ". I\'m "+ gender +
         " I have " + age + " years. My hight : " + hight + ", my weight : " + weight + " kg." );
    }
    //Getters & Setters
    public String getGender(){
        return gender;
    }

    public String getFirstname() {
        return firstname;
    }

    
    public String getLastname() {
        return lastname;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}

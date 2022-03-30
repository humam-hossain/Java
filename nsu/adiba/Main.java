import java.util.Date;


class Human {
    private String name;
    private String gender;
    static String type = "Student";


    Human(String paraName, String paraGender){
        name = paraName; // adiba.name = "adiba";
        gender = paraGender;
    }

    // getters

    String getName(){
        return name;
    }
    String getGender(){
        return gender;
    }
    // setters
    void setName(String paraName){
        name = paraName;
    }

    public String toString(){
        return "Human [name: " + name + ", gender: " + gender + ", type: " + type + "]";
    }

}

public class Main{
    public static void main(String[] args) {
        Human adiba = new Human("adiba", "female");

        Date date = new Date();

        System.out.println(date);


        // System.out.println(adiba);

    }
}
// In main method, create a Faculty object and display name, age, salary and initial. Call 
// the toString() method of the Faculty object to display all of its information

class Person {
    String name, gender;
    int age;

    Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String getName(){
        return this.name;
    }
    String getGender(){
        return this.gender;
    }
    int getAge(){
        return this.age;
    }

    void setName(String name){
        this.name = name;
    }
    void setGender(String gender){
        this.gender = gender;
    }
    void setAge(int age){
        this.age = age;
    }
}

class Employee extends Person{
    String id, department;
    double salary;

    Employee(String name, String gender, int age, String id, String department, double salary){
        super(name, gender, age);
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    String getId(){
        return this.id;
    }
    String getDepartment(){
        return this.department;
    }
    double getSalary(){
        return this.salary;
    }

    void setId(String id){
        this.id = id;
    }
    void setDepartment(String department){
        this.department = department;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
}

public class Faculty extends Employee{
    String initial, rank;

    Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank){
        super(name, gender, age, id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }

    String getInitial(){
        return this.initial;
    }
    String getRank(){
        return this.rank;
    } 

    void setInitial(String initial){
        this.initial = initial;
    }
    void setRank(String rank){
        this.rank = rank;
    }

    public String toString(){
        return "Name: " + this.name + "\nGender: " + this.gender + "\nAge: " + this.age + "\nSalary: " + this.salary + "\nInitial: " + this.initial;
    }
    public static void main(String[] args) {
        Faculty memeber = new Faculty("", "male", 0, "", "", 0, "", "");

        System.out.println(memeber);
    }
}
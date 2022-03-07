class Person {
    String name, address;
    int age;

    Person(String name, int age, String address){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
    int getAge(){
        return this.age;
    }

    void setName(String name){
        this.name = name;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setAge(int age){
        this.age = age;
    }
}

class PartTimeEmployee extends Employee {
    double hours, rate;

    PartTimeEmployee(String name, int age, String address, String department, String designation, double hours, double rate){
        super(name, age, address, department, designation);
        this.hours = hours;
        this.rate = rate;
    }

    double getHours(){
        return this.hours;
    }
    double getRate(){
        return this.rate;
    }

    void setHours(double hours){
        this.hours = hours;
    }
    void setRate(double rate){
        this.rate = rate;
    }

    double salary(){
        return this.hours * this.rate;
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address+ "\nDepartment: " + this.department + "\nDesignation: " + this.designation + "\nSalary: " + this.salary();
    }
}

class FullTimeEmployee extends Employee{
    double basic, allowance;

    FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance){
        super(name, age, address, department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    double getBasic(){
        return this.basic;
    }
    double getAllowance(){
        return this.allowance;
    }

    void setBasic(double basic){
        this.basic = basic;
    }
    void setAllowance(double allowance){
        this.allowance = allowance;
    }

    double salary(){
        return this.basic + this.basic * this.allowance / 100;
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address+ "\nDepartment: " + this.department + "\nDesignation: " + this.designation + "\nSalary: " + this.salary();
    }
}

public class Employee extends Person{
    String department, designation;

    Employee(String name, int age, String address, String department, String designation){
        super(name, age, address);
        this.department = department;
        this.designation = designation;
    }

    String getDepartment(){
        return this.department;
    }
    String getDesignation(){
        return this.designation;
    }

    void setDepartment(String department){
        this.department = department;
    }
    void setDesignation(String designation){
        this.designation = designation;
    }
    public static void main(String[] args) {
        PartTimeEmployee p_emp = new PartTimeEmployee("Name", 0, "address", "department", "designation", 5, 5);
        FullTimeEmployee f_emp = new FullTimeEmployee("name", 0, "address", "department", "designation", 5, 5);

        System.out.println(p_emp.name + "'s salary: " + p_emp.salary());
        System.out.println(f_emp.name + "'s salary: " + f_emp.salary());
    }
}

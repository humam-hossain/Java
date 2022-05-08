public abstract class Employee{
    private String name;
    private String mobileNum;
    protected double salary;

    Employee(String name, String mobileNum){
        this.name = name;
        this.mobileNum = mobileNum;
    }

    abstract double calculateSalary();
    @Override
    public String toString(){
        return "Name: " + this.name + "\nMobile Number: " + this.mobileNum;
    }
}
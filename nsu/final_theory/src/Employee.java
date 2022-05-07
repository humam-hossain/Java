public abstract class Employee{
    private String name;
    private String mobileNum;
    protected double salary;

    abstract double calculateSalary();
    @Override
    public String toString(){
        return "Name: " + this.name + "\nMobile Number: " + this.mobileNum + "\nSalary: " + this.salary;
    }
}
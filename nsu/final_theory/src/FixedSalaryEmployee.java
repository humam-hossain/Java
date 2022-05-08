public class FixedSalaryEmployee extends Employee {
    double basicSalary;

    FixedSalaryEmployee(String name, String mobileNum, double basicSalary) {
        super(name, mobileNum);
        this.basicSalary = basicSalary;
    }
    
    @Override
    double calculateSalary(){
        return this.basicSalary + 0.3 * this.basicSalary + 0.05 * this.basicSalary;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalary: " + this.calculateSalary();
    }
}

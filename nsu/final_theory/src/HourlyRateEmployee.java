public class HourlyRateEmployee extends Employee{
    double perHourRate;
    double totalHours;

    HourlyRateEmployee(String name, String mobileNum, double perHourRate, double totalHours) {
        super(name, mobileNum);
        this.perHourRate = perHourRate;
        this.totalHours = totalHours;        
    }

    @Override
    double calculateSalary(){
        return this.perHourRate * this.totalHours;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalary: " + this.calculateSalary();
    }
}

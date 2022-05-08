public class Main {
    public static void main(String[] args) {
        FixedSalaryEmployee emp1 = new FixedSalaryEmployee("Rahim", "+8801500000000", 100);
        HourlyRateEmployee emp2 = new HourlyRateEmployee("Karim", "+8801700000000", 10, 300);
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

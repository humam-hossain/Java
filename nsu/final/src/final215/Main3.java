import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter How many Employee Information?");
        n = input.nextInt();

        Employee[] data = new Employee[n];
        String name, phone_number, address, designation;
        int id, salary;

        for(int i=0; i<data.length; i++){
            System.out.println("Enter "+ (i+1) +" employee details?");
            System.out.print("Name: ");
            name = input.next();

            System.out.print("Job ID: ");
            id = input.nextInt();

            System.out.print("Salary: ");
            salary = input.nextInt();

            System.out.print("Phone Number: ");
            phone_number = input.next();

            System.out.print("Address: ");
            address = input.next();

            System.out.print("Designation: ");
            designation = input.next();

            System.out.println();

            data[i] = new Employee(name, id, salary, phone_number, address, designation);
        }

        HighestSalary obj = new HighestSalary();
        LowestSalary obj2 = new LowestSalary();
        Display display = new Display();

        try{
            data[0].information(data);
            obj.hSalary(data);
            obj2.lSalary(data);

            System.out.println();
            
            display.lowest();
            System.out.println();
            
            display.highest();
            System.out.println();

            display.average(data);
            System.out.println();

            display.allData();
        }catch(Exception e){
            System.out.println(e);
        }

        input.close();
    }
}

import java.io.File;
import java.util.Scanner;

public class Display implements Salary{
    @Override
    public void allData() throws Exception{
        File file = new File("EmployeeInformation.txt");
        Scanner input = new Scanner(file);

        System.out.println("All Employee: ");
        System.out.println("Name\tID\tSalary\tPhone\tddress\tDesignation");
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }

        input.close();
    }

    @Override
    public void highest() throws Exception{
        File file = new File("highest.txt");
        Scanner input = new Scanner(file);

        System.out.println("Highest Salary: ");
        System.out.println("Name\tID\tSalary\tPhone\tddress\tDesignation");
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }

        input.close();
    }

    @Override
    public void lowest() throws Exception{
        File file = new File("lowest.txt");
        Scanner input = new Scanner(file);

        System.out.println("Lowest Salary: ");
        System.out.println("Name\tID\tSalary\tPhone\tddress\tDesignation");
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }

        input.close();
    }

    @Override
    public void average(Employee[] data){
        double sum = 0;

        for(int i=0; i<data.length; i++){
            sum += data[i].salary;
        }

        System.out.println("Average: " + sum/data.length);
    }
}

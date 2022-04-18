import java.io.File;
import java.util.Scanner;

public abstract class EmployeeData {
    void data() throws Exception{
        File file = new File("EmployeeInformation.txt");
        Scanner input = new Scanner(file);

        int count=0;
        while(input.hasNextLine()){
            count++;
        }

        Employee[] data = new Employee[count];

        for(int i=0; i<data.length; i++){
            data[i].name = input.next();
            data[i].id = input.nextInt();
            data[i].salary = input.nextInt();
            data[i].phone_number = input.next();
            data[i].address = input.next();
            data[i].designation = input.next();            
        }

        HighestSalary obj = new HighestSalary();

        obj.hSalary(data);

        input.close();

    }

    abstract void lSalary(Employee[] data) throws Exception;
}

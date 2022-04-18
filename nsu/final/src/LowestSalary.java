import java.io.File;
import java.io.FileWriter;

public class LowestSalary extends EmployeeData{
    @Override
    public void lSalary(Employee[] data) throws Exception{
        int min_salary = data[0].salary;
        int min_id = 0;

        for(int i=1; i<data.length; i++){
            if(data[i].salary < min_salary){
                min_salary = data[i].salary;
                min_id = i;
            }
        }

        File file = new File("lowest.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("lowest.txt");
        fw.write(data[min_id].toString());
        fw.close();

        System.out.println("Lowest Salary information stored successfully. ");
    }
}

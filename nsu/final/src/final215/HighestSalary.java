import java.io.File;
import java.io.FileWriter;

public class HighestSalary {
    void hSalary(Employee[] data) throws Exception{
        int max_salary = data[0].salary;
        int max_id = 0;

        for(int i=1; i<data.length; i++){
            if(data[i].salary > max_salary){
                max_salary = data[i].salary;
                max_id = i;
            }
        }

        File file = new File("highest.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("highest.txt");
        fw.write(data[max_id].toString());
        fw.close();

        System.out.println("Highest Salary information stored successfully");
    }
}

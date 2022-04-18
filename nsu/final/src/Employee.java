import java.io.File;
import java.io.FileWriter;

public class Employee {
    String name, phone_number, address, designation;
    int id, salary;

    Employee(String name, int id, int salary, String phone_number, String address, String designation){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phone_number = phone_number;
        this.address = address;
        this.designation = designation;
    }

    void information(Employee[] data) throws Exception{
        File file = new File("EmployeeInformation.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("EmployeeInformation.txt");
        
        String info = "";
        for(int i=0; i<data.length; i++){
            info += data[i].toString() + "\n";
        }

        fw.write(info);
        fw.close();

        System.out.println("All Employee Information stored successfully");
    }

    @Override
    public String toString(){
        return this.name + "\t" + this.id + "\t" + this.salary + "\t" + this.phone_number + "\t" + this.address + "\t" + this.designation;
    }
}

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// Create another class named student. it will inherit University and implement CSE.
// Now take one student  info in main method from user input.And pass to fWrite method

class Student extends University implements CSE{
    String name;
    int marks;
    double cgpa;

    Student(String name, int marks, double cgpa){
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;
    }

    @Override
    public void fCreate() throws Exception {
        // TODO Auto-generated method stub
        File file = new File("student.txt");

        if(file.createNewFile()){
            System.out.println("Created");
        }else{
            System.out.println("Already exist!");
        }
    }

    @Override
    public void fWrite(String name, int marks, double cgpa) throws Exception {
        // TODO Auto-generated method stub
        FileWriter fw = new FileWriter("student.txt");

        fw.write(name + " " + marks + " " + cgpa);
        fw.close();
        
    }

    @Override
    public void fRead() throws Exception{
        // TODO Auto-generated method stub
        Scanner input = new Scanner(new FileReader("student.txt"));

        while(input.hasNext()){
            System.out.println(input.next() + " " + input.nextInt() + " " + input.nextDouble());
        }

        input.close();
    }    
}

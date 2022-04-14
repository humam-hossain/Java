import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String name;
        int marks;
        double cgpa;

        Scanner input = new Scanner(System.in);

        System.out.print("Student's Name: ");
        name = input.nextLine();

        System.out.print("Marks: ");
        marks = input.nextInt();

        System.out.print("CGPA: ");
        cgpa = input.nextDouble();

        System.out.println();
        
        input.close();

        Student std = new Student(name, marks, cgpa);
        try{
            std.fCreate();
            std.fWrite(name, marks, cgpa);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
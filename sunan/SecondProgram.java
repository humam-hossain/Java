// 2.  Take a student full name,id,section,course code,cgpa from user 
// input.Then print in the console screen. 

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        String full_name;
        int id, section, course_code;
        double cgpa;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter your full name: ");
            full_name = input.nextLine();

            System.out.print("Enter your ID: ");
            id = input.nextInt();

            System.out.print("Enter your section: ");
            section = input.nextInt();

            System.out.print("Enter your course code: ");
            course_code = input.nextInt();

            System.out.print("Enter your cgpa: ");
            cgpa = input.nextDouble();

            System.out.println("\nFull Name: " + full_name);
            System.out.println("ID: " + id);
            System.out.println("Section: " + section);
            System.out.println("Course code: " + course_code);
            System.out.println("CGPA: " + cgpa);
            
        }
    }
}

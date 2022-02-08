// 4. Take three students full name,id,section,cgpa,course code from the user 
// input. Print all information,Also calculate the sum and average of 
// cgpa.Print results.

import java.util.Scanner;

public class Student{
    String name;
    int id, section, course_code;
    double cgpa;

    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next();

        System.out.print("Enter id: ");
        id = input.nextInt();

        System.out.print("Enter section: ");
        section = input.nextInt();

        System.out.print("Enter cgpa: ");
        cgpa = input.nextDouble();

        System.out.print("Enter course code: ");
        course_code = input.nextInt();

        System.out.println("\n");

        // input.close();   
    }

    public void info_print(){
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Section: " + section);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Course code: " + course_code);
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.info_print();
        std2.info_print();
        std3.info_print();
    }
}
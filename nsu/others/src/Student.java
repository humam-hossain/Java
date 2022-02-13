package others.src;

// Take three students' full names, IDs, ages from the user input. 
// Then print student name, id, if age is between 23-26 and age, is not even.

import java.util.Scanner;

public class Student{
    String name;
    int id, age;

    public Student(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your Fullname: ");
            name = input.nextLine();

            System.out.print("Enter id: ");
            id = input.nextInt();

            System.out.print("Age: ");
            age = input.nextInt();
        }
        System.out.println("\n");
    }

    public void info_print(){
        if(age >= 23 && age <= 26 && age % 2 != 0){
            System.out.println("Student Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("\n");
        }
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
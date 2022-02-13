package Lab2.src;

// 1. Take Three students Full Name,id,section,total marks from user input. Calculate 
// their grade and grade point using NSU grading policy.Then Print all 
// information .(Solve this problem using if,,else if and switch..case) 

import java.util.Scanner;

public class Task1 {
    String full_name, grade;
    int id, section;
    double total_marks, grade_point;

    public Task1(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Student's Full Name: ");
            full_name = input.nextLine();

            System.out.print("ID: ");
            id = input.nextInt();

            System.out.print("Section: ");
            section = input.nextInt();

            System.out.print("Total Marks: ");
            total_marks = input.nextDouble();
        }

        if(total_marks < 60){
            grade = "F";
            grade_point = 0.0;
        }else if(total_marks <= 66){
            grade = "D Poor";
            grade_point = 1.0;
        }else if(total_marks <= 69){
            grade = "D+";
            grade_point = 1.3;
        }else if(total_marks <= 72){
            grade = "C-";
            grade_point = 1.7;
        }else if(total_marks <= 76){
            grade = "C Average";
            grade_point = 2.0;
        }else if(total_marks <= 79){
            grade = "C+";
            grade_point = 2.3;
        }else if(total_marks <= 82){
            grade = "B-";
            grade_point = 2.7;
        }else if(total_marks <= 86){
            grade = "B Good";
            grade_point = 3.0;
        }else if(total_marks <= 89){
            grade = "B+";
            grade_point = 3.3;
        }else if(total_marks <= 92){
            grade = "A-";
            grade_point = 3.7;
        }else if(total_marks <= 100){
            grade = "A Excellent";
            grade_point = 4.0;
        }

        System.out.println();
    }

    public void info(){
        System.out.println("Student Fullname: " + full_name);
        System.out.println("ID: " + id);
        System.out.println("Section: " + section);
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Grade: " + grade);
        System.out.println("Grade Point: " + grade_point);

        System.out.println();
    }


    public static void main(String[] args) {
        Task1 std1 = new Task1();
        Task1 std2 = new Task1();
        Task1 std3 = new Task1();

        System.out.println("Students Information\n");
        std1.info();
        std2.info();
        std3.info();
    }
}

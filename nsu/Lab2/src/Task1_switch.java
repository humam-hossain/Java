package Lab2.src;

// 1. Take Three students Full Name,id,section,total marks from user input. Calculate 
// their grade and grade point using NSU grading policy.Then Print all 
// information .(Solve this problem using if,,else if and switch..case) 

import java.util.Scanner;

public class Task1_switch {
    String full_name, grade;
    int total_marks, id, section;
    double grade_point;

    public Task1_switch(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Student's Full Name: ");
            full_name = input.nextLine();

            System.out.print("ID: ");
            id = input.nextInt();

            System.out.print("Section: ");
            section = input.nextInt();

            System.out.print("Total Marks: ");
            total_marks = input.nextInt();
        }
        switch(total_marks){
            case 60: 
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66:
                grade = "D Poor";
                grade_point = 1.0;
                break;
            case 67: 
            case 68: 
            case 69:
                grade = "D+";
                grade_point = 1.3;
                break;
            case 70: 
            case 71: 
            case 72:
                grade = "C-";
                grade_point = 1.7;
                break;
            case 73: 
            case 74: 
            case 75: 
            case 76:
                grade = "C Average";
                grade_point = 2.0;
                break;
            case 77: 
            case 78: 
            case 79:
                grade = "C+";
                grade_point = 2.3;
                break;
            case 80: 
            case 81: 
            case 82:
                grade = "B-";
                grade_point = 2.7;
                break;
            case 83: 
            case 84: 
            case 85: 
            case 86:
                grade = "B Good";
                grade_point = 3.0;
                break;
            case 87: 
            case 88: 
            case 89:
                grade = "B+";
                grade_point = 3.3;
                break;
            case 90: 
            case 91: 
            case 92:
                grade = "A-";
                grade_point = 3.7;
                break;
            case 93: 
            case 94: 
            case 95: 
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100:
                grade = "A Excellent";
                grade_point = 4.0;
                break;
            default:
                grade = "F";
                grade_point = 0.0;
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
        Task1_switch std1 = new Task1_switch();
        Task1_switch std2 = new Task1_switch();
        Task1_switch std3 = new Task1_switch();

        System.out.println("Students Information\n");
        std1.info();
        std2.info();
        std3.info();
    }
}

// Create a class named Department with two variables deptName,location

// Create another class named CSE with three variables studentName,marks,idand a method
// CSE max(CSE[] arr): It will calculate the highest scorer's information and 
// return to the calling function.

// CSE class inherit the department class.
// Take five CSE students information using array of object from user input in main method.
// Then print all info and highest scorer's info.

// Note: Decalare necessary constructor and toString

import java.util.Scanner;

class Department{
    String deptName, location;

    Department(String deptName, String location){
        this.deptName = deptName;
        this.location = location;
    }

    public String toString(){
        return "Department Name: " + this.deptName + "\nLocation: " + this.location;
    }
}

public class CSE extends Department {
    String studentName, id;
    int marks;

    CSE(String deptName, String location, String studentName, String id, int marks){
        super(deptName, location);
        this.studentName = studentName;
        this.id = id;
        this.marks = marks;
    }

    CSE max(CSE[] arr){
        int h_marks = arr[0].marks, h_index = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i].marks > h_marks){
                h_marks = arr[i].marks;
                h_index = i;
            }
        }

        return arr[h_index];
    }

    public String toString(){
        return super.toString() + "\nStudent's Name: " + this.studentName + "\nID: " + this.id + "\nMarks: " + this.marks;
    }
    public static void main(String[] args) {
        String deptName, location, studentName, id;
        int temp_marks;

        Scanner input = new Scanner(System.in);
        CSE[] std = new CSE[5];

        for(int i=0; i<std.length; i++){
            System.out.print("Student Name " + (i+1) + ": ");
            studentName = input.next();

            System.out.print("ID: ");
            id = input.next();

            System.out.print("Department Name: ");
            deptName = input.next();

            System.out.print("Location: ");
            location = input.next();

            System.out.print("Marks: ");
            temp_marks = input.nextInt();

            std[i] = new CSE(deptName, location, studentName, id, temp_marks);
        }

        System.out.println("\nHighest Scorer:\n" + std[0].max(std));

        input.close();
    }
}

// Create a class named Department with three private variables deptName,location,marks
// and a method
// CSE min(CSE[] arr):It will calculate the lowest scorer's information and return to the calling function.
// Create another class named CSE with two private variables studentName,id and a overridden method
// CSE min(CSE[] arr): It will calculate the lowest scorer's information and return to the calling function.
// CSE class inherit the department class.
// Take five CSE students information using array of object from user input in main method.
// Then print all info , highest,lowest scorer's info.
// Note: Decalare necessary constructors and toString methods

import java.util.Scanner;

class Department{
    protected String deptName, location;
    protected int marks;

    Department(String deptName, String location, int marks){
        this.deptName = deptName;
        this.location = location;
        this.marks = marks;
    }

    CSE min(CSE[] arr){
        int m_marks = arr[0].marks, m_index = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i].marks < m_marks){
                m_marks = arr[i].marks;
                m_index = i;
            }
        }

        return arr[m_index];
    }

    CSE max(CSE[] arr){
        return arr[0];
    }

    public String toString(){
        return "Department Name: " + this.deptName + "\nLocation: " + this.location + "\nMarks: " + this.marks;
    }
}

public class CSE extends Department {
    private String studentName, id;

    CSE(String deptName, String location, int marks, String studentName, String id){
        super(deptName, location, marks);
        this.studentName = studentName;
        this.id = id;
    }

    @Override
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
        return "Student's Name: " + this.studentName + "\nID: " + this.id + super.toString();
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

            std[i] = new CSE(deptName, location, temp_marks, studentName, id);
        }

        System.out.println("\nAll info:\n");
        for(int i=0; i<std.length; i++){
            System.out.println(std[i]);
        }
        System.out.println("\nHighest Scorer:\n" + std[0].max(std));
        System.out.println("\nLowest Scorer:\n" + std[0].min(std));

        input.close();
    }
}

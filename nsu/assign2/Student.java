// Task1: Take five students name,id,section,cgpa,gender from user input.
// i.Print students id, section if gender is female and name length is 4
// ii. Print students name,cgpa if gender is male and name start with S 

import java.util.Scanner;

public class Student{
    String name, gender;
    int id, section;
    double cgpa;
    

    public Student(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("ID: ");
        id = input.nextInt();

        System.out.print("Section: ");
        section = input.nextInt();

        System.out.print("CGPA: ");
        cgpa = input.nextDouble();

        System.out.print("Gender: ");
        gender = input.next();

        System.out.println();

        // input.close();
    }

    public static void main(String[] args) {
        Student[] std = new Student[5];
        
        for(int i=0; i<std.length; i++){
            std[i] = new Student();
        }

        System.out.println("Results");

        for(int i=0; i<std.length; i++){
            if(std[i].gender.equals("female") && std[i].name.length() == 4){
                System.out.println("ID: " + std[i].id + "\nSection: " + std[i].section + "\n");
            }else if(std[i].gender.equals("male") && std[i].name.charAt(0) == 'S'){
                System.out.println("Name: " + std[i].name + "\nCGPA: " + std[i].cgpa + "\n");
            }
        }
    }
}
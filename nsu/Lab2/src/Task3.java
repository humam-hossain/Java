package Lab2.src;

// 3. Take five students name,id,section,cgpa,gender from user input. 
// i.Print students id,section if gender is  female and name length is 4 
// ii.Print students name,cgpa if gender is male and name start with S 

import java.util.Scanner;

public class Task3 {
    String name, gender;
    int id, section;
    double cgpa;

    public Task3(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Student Name: ");
            name = input.next();

            System.out.print("ID: ");
            id = input.nextInt();

            System.out.print("Section: ");
            section = input.nextInt();

            System.out.print("CGPA: ");
            cgpa = input.nextDouble();

            System.out.print("Gender: ");
            gender = input.next();
        }
        System.out.println();
    }

    public void info(Task3 std){
        if(std.gender.equals("female") && std.name.length() == 4){
            System.out.println("ID: " + std.id);
            System.out.println("Section: " + std.section);
            System.out.println();
        }else if(std.gender.equals("male") && std.name.charAt(0) == 'S'){
            System.out.println("Name: " + std.name);
            System.out.println("cgpa: " + std.cgpa);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Task3 std1 = new Task3();
        Task3 std2 = new Task3();
        Task3 std3 = new Task3();
        Task3 std4 = new Task3();
        Task3 std5 = new Task3();
        
        std1.info(std1);
        std2.info(std2);
        std3.info(std3);
        std4.info(std4);
        std5.info(std5);
    }
}

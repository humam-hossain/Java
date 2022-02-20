// Create a class with two methods name:
// void min(parameters)-It will calculate and print the highest scorer's all info.
// void max(parameters)-It will calculate and print the lowest scorer's all info.
// Now take four students' names,  marks from user input in the main method. 
// Then print the output using the min and max functions.

import java.util.Scanner;

public class Student{
    String name;
    int mark;
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        Student max_std = new Student();
        Student min_std = new Student();

        functions obj = new functions();
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        std1.name = input.next();

        System.out.print("Mark: ");
        std1.mark = input.nextInt();


        System.out.print("Name: ");
        std2.name = input.next();

        System.out.print("Mark: ");
        std2.mark = input.nextInt();


        System.out.print("Name: ");
        std3.name = input.next();

        System.out.print("Mark: ");
        std3.mark = input.nextInt();


        System.out.print("Name: ");
        std4.name = input.next();

        System.out.print("Mark: ");
        std4.mark = input.nextInt();

        max_std = obj.max(std1, std2, std3, std4);
        min_std = obj.min(std1, std2, std3, std4);
        
        System.out.println("Max Score : " + max_std.mark);
        System.out.println("Max Scorer : " + max_std.name);
        System.out.println("Min Score : " + min_std.mark);
        System.out.println("Min Scorer : " + min_std.name);
        
        input.close();
    }
}

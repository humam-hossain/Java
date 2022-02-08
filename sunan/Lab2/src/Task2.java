// 2. Write a program to print the result of this equation                     
// Result = 3π +(height * width) + height^2 /(2π * width^2)  
// Note: Take height and width from the user input.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double height, width, result;


        try(Scanner input = new Scanner(System.in)){
            System.out.print("Height = ");
            height = input.nextDouble();

            System.out.print("Width = ");
            width = input.nextDouble();
            
            result = 3 * Math.PI + (height * width) + (height * height) / (2 * Math.PI * width * width);
            System.out.println("Result = " + result);
        }
    }
}

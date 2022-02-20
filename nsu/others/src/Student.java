// 2. Declare a class named calculation with methods named, 
 
// Void allSum()—calculate sum of all marks and cgpa 
// double allAverage()--calcualte average of all marks and cgpa 
// int evenSum()—calcualte sum and average of all even marks 
// double oddSum()—calcualte suma nd average of all odd marks 
 
// Take  eight  students  full  name,marks,cgpa  from  user  input  in  main  method. 
// Then pass 1st,3rd,5th ,7th  students info to oddSum
// and 2nd, 4th, 6th,8th students info to evenSum function. 
// Pass all students info to allSum and allAverage function. 
// Then print the results.

import java.util.Scanner;

public class Student{
    String name;
    int mark;
    double cgpa;
    

    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("mark: ");
        mark = input.nextInt();

        System.out.print("CGPA: ");
        cgpa = input.nextDouble();

        System.out.println("\n");
    }

    public static void main(String[] args) {
        Student[] std = new Student[8];
        Calculation obj = new Calculation();
        
        for(int i=0; i<8; i++){
            std[i] = new Student();
        }

        obj.evenSum(std[1], std[3], std[5], std[7]);
        obj.oddSum(std[0], std[2], std[4], std[6]);
        obj.allSum(std);
        obj.allAverage(std);
    }
}
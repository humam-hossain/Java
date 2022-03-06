// Create a class named Employee with two variables Name,Salary and a method named
// Employee highest(Employee[] arr): It will calculate the 2nd highest paid employee 
// information and return result to calling function.
// Now take five employee info using array of object from user input and print 2nd 
// highest paid employee info.
// Note: Declare necessary constructor.

import java.util.Scanner;

public class Employee{
    String name;
    int salary;

    Employee(){

    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Name: " + this.name + "\nSalary: " + this.salary;
    }

    Employee highest(Employee[] arr){
        int h_index=0, h2_index=0, h_salary=arr[0].salary;

        for(int i=1; i<arr.length; i++){
            if(h_salary < arr[i].salary){
                h_salary = arr[i].salary;
                h2_index = h_index;
                h_index = i;
            }
        }

        return arr[h2_index];
    }

    public static void main(String[] args) {
        String name;
        int salary;

        Scanner input = new Scanner(System.in);
        Employee[] emp = new Employee[5];

        for(int i=0; i<emp.length; i++){
            System.out.println("Employee "+ (i+1) +":");

            System.out.print("Name: ");
            name = input.next();
            
            System.out.print("Salary: ");
            salary = input.nextInt();

            emp[i] = new Employee(name, salary);
        }

        System.out.println("\nSecond Highest paid employee info:");
        System.out.println(emp[0].highest(emp));

        input.close();
    }
}
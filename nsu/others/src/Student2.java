// Create a class with an overloaded method named Search.
// void Search(parameters): It will print the student2 marks and cgpa If the name is sakib and 
// the length is 5. double Search(parameters): It will print the sum and average of cgpa If the gender 
// is male and the name end with khan. Now Take two student2s' names, marks,cgpa from user input in the 
// main method. Then print the results using search methods.

import java.util.Scanner;

public class Student2 {
    String name, gender;
    int mark;
    double cgpa;

    Student2(){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Mark: ");
        mark = input.nextInt();

        System.out.print("CGPA: ");
        cgpa = input.nextDouble();

        System.out.print("Gender: ");
        gender = input.next();;

        System.out.println();
    }

    void Search(){
        if(name.equals("sakib")){
            System.out.println("Mark: " + mark);
            System.out.println("CGPA: " + cgpa);
        }
    }
    
    double Search(String nam, String gendr, double cg){
        double average, sum = 0;
        int count = 0;
        boolean isTrue = true;

        if(!(nam.charAt((nam.length()-1)) == 'n')){
            isTrue = false;
        }
        if(!(nam.charAt((nam.length()-2)) == 'a')){
            isTrue = false;
        }
        if(!(nam.charAt((nam.length()-3)) == 'h')){
            isTrue = false;
        }
        if(!(nam.charAt((nam.length()-4)) == 'k')){
            isTrue = false;
        }
        
        if(gendr.equals("male") && isTrue == true){
            sum += cg;
            count++;
        }

        isTrue = true;

        if(!(name.charAt((name.length()-1)) == 'n')){
            isTrue = false;
        }
        if(!(name.charAt((name.length()-2)) == 'a')){
            isTrue = false;
        }
        if(!(name.charAt((name.length()-3)) == 'h')){
            isTrue = false;
        }
        if(!(name.charAt((name.length()-4)) == 'k')){
            isTrue = false;
        }
        
        if(gender.equals("male") && isTrue == true){
            sum += cgpa;
            count++;
        }

        average = sum/count;

        return sum; 
    }

    void info(){
        System.out.println(name);
        System.out.println(mark);
        System.out.println(cgpa);
        System.out.println(gender);
    }
    public static void main(String[] args) {
        Student2 std1 = new Student2();
        Student2 std2 = new Student2();

        // std1.info();
        // std2.info();

        std1.Search();
        std2.Search();
        System.out.println(std1.Search(std2.name, std2.gender, std2.cgpa));
    }
}

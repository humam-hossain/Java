import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        String name;
        int id;
        int sec;
        String course_code;
        double cgpa;
        char ch;

        Scanner input = new Scanner(System.in);
        // System.out.print("Name: ");
        // name = input.nextLine();

        // System.out.print("ID: ");
        // id = input.nextInt();

        // System.out.print("Section: ");
        // sec = input.nextInt();

        // System.out.print("Course code: ");
        // course_code = input.next();

        // System.out.print("CGPA: ");
        // cgpa = input.nextDouble();

        ch = input.next().charAt(0);

        input.close();

        // System.out.println(name);
        // System.out.println(id);
        // System.out.println(sec);
        // System.out.println(course_code);
        // System.out.println(cgpa);
    }
}
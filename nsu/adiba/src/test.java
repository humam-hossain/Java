import java.util.Scanner;

// 3. Create a Triangle class. Now create IllegalTriangleException class that extends Exception.
// If the sum of any two sides is not greater than the third side, the Triangle class should throw
// IllegalTriangleException.

public class test{
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter values: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        try{
            Triangle obj = new Triangle(a, b, c);
        }catch(Exception e){
            System.out.println(e);
        }

        in.close();
    }
}
// 2. Write a complete method having the signature myceilling(double value) that can
// return mathematical ceiling output as a double but without using the built-in Math.ceil() method.

import java.util.Scanner;

public class Ceil {
    double myceilling(double value){
        int temp = (int)value;
        value = temp + 1;

        return value;
    }
    public static void main(String[] args) {
        double num;
        Ceil Number = new Ceil();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextDouble();

        System.out.print(Number.myceilling(num));
    }
}

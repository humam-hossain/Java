package others.src;

// 3.  Declare all types of data type using user input.Then print in the console 
// screen.

import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        int num;
		float fnum;
		double dnum;
		short snum;
		long lnum;
		char ch;
        byte bnum;
		boolean check;
		String str;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Integer: ");
            num = input.nextInt();

            System.out.print("Float: ");
            fnum = input.nextFloat();

            System.out.print("Double: ");
            dnum = input.nextDouble();

            System.out.print("Short: ");
            snum = input.nextShort();

            System.out.print("Long: ");
            lnum = input.nextLong();

            System.out.print("Character: ");
            ch = input.next().charAt(0);

            System.out.print("Byte: ");
            bnum = input.nextByte();

            System.out.print("Boolean: ");
            check = input.nextBoolean();

            System.out.print("String: ");
            str = input.next();

            System.out.println("\n\nInteger: " + num);
            System.out.println("Float: " + fnum);        
            System.out.println("Double: " + dnum);        
            System.out.println("Short: " + snum);        
            System.out.println("Long: " + lnum);            
            System.out.println("Character: " + ch);
            System.out.println("Byte: " + bnum);            
            System.out.println("Boolean: " + check);
            System.out.println("String: " + str);        
    
        }

        
    }
}

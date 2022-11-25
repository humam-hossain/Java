/*Take two integers as input from the user. Print all odd numbers that fall within the range of
those two integers. For example, if user inputs 40 and 79, you have to print all odd numbers from
40 to 79*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b ;
        System.out.println("Enter the numbers Range: ");
        a = in.nextInt();
        b = in.nextInt();
        System.out.print("Odd numbers: ");
        for(int i = a ; i<=b ; i++){
             if(i%2!=0) System.out.print(i+" ");
        }
    }
}

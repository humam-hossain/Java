// 3. Write a program that takes an integer and prints its divisors, 
// i.e. divisors of 12 are 1, 2, 3, 4, 6.

import java.util.Scanner;
import java.lang.Math;

public class Divisors {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int num;
			double condition;

			System.out.print("Enter an integer: ");
			num = input.nextInt();
			condition = Math.sqrt(num);

			// System.out.println(Math.round(condition));

			System.out.print("divisors of " + num + " are 1, ");
			for(int i=2; i<condition; i++){
			    if(num % i == 0){
			        if(num/i == i){
			            System.out.print(i + ", ");
			        }else{
			            System.out.print(i + ", " + num/i + ", ");
			        }
			    }

			}
		}
    }
}

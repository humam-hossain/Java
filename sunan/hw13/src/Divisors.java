// 3. Write a program that takes an integer and prints its divisors, 
// i.e. divisors of 12 are 1, 2, 3, 4, 6.

import java.util.Scanner;
import java.lang.Math;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer: ");
        num = input.nextInt();
        
        System.out.print("divisors of " + num + " are 1 ");
        for(int i=2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                if(num/i == i){
                    System.out.println(i + " ");
                }else{
                    System.out.print(i + " " + num/i + " ");
                }
            }
        }
    }
}

// 1. Write a program that takes an integer and determines if it’s prime or not. A number is prime 
// if it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc. 

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num, prime=1;

        Scanner input = new Scanner(System.in);
            System.out.print("Enter a num: ");
            num = input.nextInt();
        
        for(int i=2; i<num; i++){
            if(num % i == 0){
                prime = 0;
            }
        }

        if(prime == 1){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
        }
    }
}

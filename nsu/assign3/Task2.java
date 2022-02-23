// 2. Take an integer from user, generate that many fibonacci numbers and store in an 
// array. Display the array.
// Sample output:
// Enter a number: 8
// First 8 Fibonacci numbers: 0 1 1 2 3 5 8 13

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int[] f = new int[n];
        
        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<n; i++){
            f[i] = f[i-2] + f[i-1]; 
        }

        System.out.print("First " + n + " Fibonacci numbers: ");
        for(int i=0; i<n; i++){
            System.out.print(f[i] + " ");
        }

        input.close();
    }
}

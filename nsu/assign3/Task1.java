// 1. Declare an integer array of size 6, initialize it with user input, calculate and print the 
// average. Now calculate the percentage of numbers that are above that average.
// For example: if 3 of the array elements are greater than average, percentage is: 3 * 100 / 6 = 50%

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[6];
        double average, sum=0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        input.close();

        average = sum/arr.length;
        System.out.println("Average: " + average);

        for(int i=0; i<arr.length; i++){
            if(arr[i] > average){
                count++;
            }
        }

        System.out.println("The % of elements greater than average: " + (count * 100/arr.length) + "%");

    }
}
// 4. Take an integer array and print only the numbers that are in consecutive orders of 3.
// Enter size: 12
// Enter numbers: 1 2 3 2 2 2 11 4 4 4 3 3
// Output: 2 4

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int min, max;
        
        System.out.print("Enter numbers: ");
        arr[0] = input.nextInt();
        min = arr[0];
        max = arr[0];

        for(int i=1; i<size; i++){
            arr[i] = input.nextInt();

            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int c_size = max - min + 1;
        // System.out.println(c_size);
        int[] count = new int[c_size];

        for(int i=0; i<size; i++){
            count[arr[i]-min]++;
        }

        System.out.print("Output: ");
        for(int i=0; i<c_size; i++){
            if(count[i]>0){
                System.out.print((i+min) + " ");
            }
        }        

        input.close();
    }
}

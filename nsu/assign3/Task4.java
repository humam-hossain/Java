// 4. Take an integer array and print only the numbers that are in consecutive orders of 3.
// Enter size: 12
// Enter numbers: 1 2 3 2 2 2 11 4 4 4 3 3
// Output: 2 4

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=input.nextInt();
        int[] number= new int[size];

        System.out.println("Enter numbers: ");
        for(int count=0; count<number.length; count++){
            number[count]=input.nextInt();
        }
        for(int count=0; count<number.length-2; count++){
            if(number[count]==number[count+1] && number[count]==number[count+2]){
                System.out.println("Output: "+number[count]);
            }
        }
    }
}
// 48. C++program to print the square of array elements
// Here, we are going to learn how to print the square of array elements in
// C++programming language?

import java.util.Scanner;

class Solve{
    int[] squareElem(int[] arr){
        int[] tempArr = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            tempArr[i] = arr[i] * arr[i];    
        }

        return tempArr;
    }
}
public class Task48 {
    public static void main(String[] args) {
        Solve obj = new Solve();
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        arr = obj.squareElem(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        in.close();
    }
}

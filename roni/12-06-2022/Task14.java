// 14. C++program to find second smallest element in a one dimensional array
// Here, we are implementing a C++program that will read a one dimensional array of
// integers and find the second smallest element it.

import java.util.Scanner;

class Solve{
    int func(int[] arr){
        int lowest=arr[0];
        int sec_lowest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < sec_lowest && arr[i] != lowest){
                sec_lowest = arr[i];
            }
        }

        return sec_lowest;
    }
}

public class Task14 {
    public static void main(String[] args) {
        Solve obj = new Solve();

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int result;

        result = obj.func(arr);

        System.out.println(result);

        in.close();
    }
}

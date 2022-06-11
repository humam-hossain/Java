// 11. C++program to create a new array from a given array with the elements divisible
// by a specifiC++number
// Here, we are implementing a C++program that will create a new array from a given
// array with the elements divisible by a specifiC++number in an array.

import java.util.Scanner;

class Solve{
    int[] func(int[] arr, int num){
        int[] tempArr = new int[arr.length];
        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % num == 0){
                tempArr[count] = arr[i];
                count++;
            }
        }

        int[] newArr = new int[count];

        for(int i=0; i<count; i++){
            newArr[i] = tempArr[i];
        }

        return newArr;
    }
}

public class Task11 {
    public static void main(String[] args) {
        Solve obj = new Solve();
        int[] result;

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int num = in.nextInt();

        result = obj.func(arr, num);

        System.out.println("Result:");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + "\t");
        }

        in.close();
    }
}

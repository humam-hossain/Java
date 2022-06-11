// 13. C++program to find two largest elements in a one dimensional array
// Here, we are implementing a C++program that finds the two largest numbers from a one
// dimensional array
import java.util.Scanner;

class Solve{
    int[] func(int[] arr){
        int highest=arr[0];
        int sec_highest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > highest){
                highest = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > sec_highest && arr[i] != highest){
                sec_highest = arr[i];
            }
        }

        return new int[]{highest, sec_highest};
    }
}

public class Task13 {
    public static void main(String[] args) {
        Solve obj = new Solve();

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int[] result;

        result = obj.func(arr);

        System.out.println(result[0] + "\t" + result[1]);

        in.close();
    }
}

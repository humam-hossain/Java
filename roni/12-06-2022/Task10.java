import java.util.Scanner;

// 10. C++program to count total number of elements divisible by a specifiC++number in
// an array
// Here, we are implementing a C++program that will count total number of elements
// divisible by a specifiC++number in an array.

class Solve{
    int func(int[] arr, int num){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % num == 0){
                count++;
            }
        }

        return count;
    }
}

public class Task10 {
    public static void main(String[] args) {
        Solve obj = new Solve();
        int result;

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int num = in.nextInt();

        result = obj.func(arr, num);
        System.out.println("Count = " + result);

        in.close();
    }
}

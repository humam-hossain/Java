import java.util.Scanner;

// 9. C++program to create array with reverse elements of one dimensional array
// In this C++program, we are going to learn how to create an array with reverse elements
// of given array? Here, we have an array with some integer elements and we have to
// create another array by assigning elements of first array in reverse order

class Solve{
    int[] func(int[] arr){
        int[] reversed = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
}

public class Task9 {
    public static void main(String[] args) {
        Solve obj = new Solve();
        
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int[] reversedArr;

        reversedArr = obj.func(arr);

        for(int i=0; i<reversedArr.length; i++){
            System.out.print(reversedArr[i] + "\t");
        }

        in.close();
    }
}

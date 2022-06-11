import java.util.Scanner;

// 58. C++program to create an integer array and store the EVEN and ODD elements in a
// different array
// Here, we will create an integer array then find and store EVEN and ODD elements in
// two different separate arrays and print them.

class Solve{
    void evenArray(int[] arr){
        System.out.println("\nEven array:");

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + "\t");
            }
        }
    }

    void oddArray(int[] arr){
        System.out.println("\nOdd array: ");

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
public class Task58{
    public static void main(String[] args) {
        Solve obj = new Solve();
        
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        obj.evenArray(arr);
        obj.oddArray(arr);

        in.close();
    }
}
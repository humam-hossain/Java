import java.util.Scanner;

// 8. C++program to check prime numbers in an array
// In this C++program, we are going to learn to check prime numbers in an array. We will
// declare an array with some prime and nonprime numbers, and then print the elements
// with “prime” and “Not Prime” message.

class Solve{
    boolean isPrime(int num){
        if(num <= 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for(int i=3; i<num; i+=2){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    void func(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i] + ": Prime");
            }else{
                System.out.println(arr[i] + ": Not Prime");
            }
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        Solve obj = new Solve();
        
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }


        obj.func(arr);

        in.close();
    }
}

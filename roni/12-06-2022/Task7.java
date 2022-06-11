import java.util.Scanner;

// 7. C++program to delete prime numbers from an array
// In this C++program, we are going to learn how can we check and delete prime numbers
// from an array? We are declaring an array with some prime and nonprime numbers and
// deleting prime numbers and then printing array elements with the numbers which are not
// prime

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
            if(!isPrime(arr[i])){
                System.out.print(arr[i] + "\t");
            }
        }
    }
}

public class Task7 {
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

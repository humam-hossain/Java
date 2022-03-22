// Write a method having a  2D integer-valued matrix as an argument and 
// returns a boolean value whether the input 2D matrix is an identity matrix or not. Note, an 
// identity matrix contains 1s in its main diagonal positions and 0s in other locations. 

import java.util.Scanner;

public class Identity_matrix {
    Identity_matrix(){

    }

    // just this method is the answer. rest of the code is for testing.
    boolean identity_checker(int[][] arr){
        if(arr.length != arr[0].length){
            return false;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j && arr[i][j] != 1){
                    return false;
                }else if(i!=j && arr[i][j] != 0){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Identity_matrix obj = new Identity_matrix();
        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = input.nextInt();
            }
        }

        System.out.println(obj.identity_checker(array));

        input.close();
    }
}

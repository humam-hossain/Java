// Take two 4*3 matrix from user input.  Then find and print each sum of column0,column1,row0,row2 
// of first matrix Then find and print each sum of row1,row3,column1,column2 of second matrix

import java.util.Scanner;

public class Matrix{
    int[][] matrix = new int[4][3];

    Matrix(){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        // input.close();
    }

    int sum_column(int n){
        int sum = 0;
        
        for(int i=0; i<4; i++){
            sum += matrix[i][n];
        }

        return sum;
    }

    int sum_row(int m){
        int sum = 0;

        for(int i=0; i<3; i++){
            sum += matrix[m][i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Matrix matrix_1 = new Matrix();
        Matrix matrix_2 = new Matrix();

        System.out.println(matrix_1.sum_column(0)); 
        System.out.println(matrix_1.sum_column(1));
        
        System.out.println(matrix_1.sum_row(0)); 
        System.out.println(matrix_1.sum_row(1));

        System.out.println(matrix_2.sum_column(0)); 
        System.out.println(matrix_2.sum_column(1));
        
        System.out.println(matrix_2.sum_row(0)); 
        System.out.println(matrix_2.sum_row(1));

    }
}
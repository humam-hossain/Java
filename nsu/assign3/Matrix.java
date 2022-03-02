// Take two 3*2 matrix from user input.
// Then find the sum and average of column1,row1 of both matrix.
// 1st matrix: sum of col1,row1
// 2nd matrix: sum of col1,row1
// result: sum average of col1  both matrix
        //   sum average of row1 both matrix

import java.util.Scanner;
public class Matrix{
    int[][] matrix = new int[3][2];

    Matrix(){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        // input.close();
    }

    int sum_column(int n){
        int sum = 0;
        
        for(int i=0; i<3; i++){
            sum += matrix[i][n];
        }

        return sum;
    }

    int sum_row(int m){
        int sum = 0;

        for(int i=0; i<2; i++){
            sum += matrix[m][i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Matrix matrix_1 = new Matrix();
        Matrix matrix_2 = new Matrix();

        System.out.println("1st matrix: sum of col1 = " + matrix_1.sum_column(0) + " ,row1 = " + matrix_1.sum_row(0));
        System.out.println("2nd matrix: sum of col1 = " + matrix_2.sum_column(0) + " ,row1 = " + matrix_2.sum_row(0));
        System.out.println("result: sum average of col1 of both matrix = " + (matrix_1.sum_column(0) + matrix_2.sum_column(0))/2);
        System.out.println("sum average of row1 of both matrix = " + (matrix_1.sum_row(0) + matrix_2.sum_row(0))/2);
    }
}
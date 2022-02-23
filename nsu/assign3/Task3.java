// 3. Take a 3X3 array and initialize it with these values:
// 3 4 9
// 2 9 11
// 4 6 0
// Calculate and print the sum for each row, column and both diagonals.


public class Task3 {
    int row(int[][] arr, int r){
        int sum=0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[r][i];
        }
        return sum;
    }

    int column(int[][] arr, int c){
        int sum=0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i][c];
        }
        return sum;
    }

    int diag_1(int[][] arr){
        int sum=0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }

    int diag_2(int[][] arr){
        int sum=0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[arr.length-i-1][i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Task3 obj = new Task3();
        int[][] arr = new int[3][3];

        arr[0][0] = 3;
        arr[0][1] = 4;
        arr[0][2] = 9;

        arr[1][0] = 2;
        arr[1][1] = 9;
        arr[1][2] = 11;

        arr[2][0] = 4;
        arr[2][1] = 6;
        arr[2][2] = 0;

        System.out.println("Sum of row 1: " + obj.row(arr, 0));
        System.out.println("Sum of row 2: " + obj.row(arr, 1));
        System.out.println("Sum of row 3: " + obj.row(arr, 2));

        System.out.println("Sum of column 1: " + obj.column(arr, 0));
        System.out.println("Sum of column 2: " + obj.column(arr, 1));
        System.out.println("Sum of column 3: " + obj.column(arr, 2));

        System.out.println("Sum of major diagonal: " + obj.diag_1(arr));
        System.out.println("Sum of minor diagonal: " + obj.diag_2(arr));
    }
}

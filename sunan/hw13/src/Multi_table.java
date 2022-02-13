// 2. Write a program that prints the multiplication table from 1 to 10.  
// 1X1=1 
// 1X2=2
// ......... 
// 5X10=50 

public class Multi_table {
    public static void main(String[] args) {
        for(int i=1; i<= 10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i + "X" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}

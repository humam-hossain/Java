import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int a,b, pow=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and its power: ");
        a = in.nextInt();
        b = in.nextInt();
        for(int i = 1 ; i<=b ; i++){
            pow = pow*a;
        }
        System.out.println("a^b= "+pow);
    }
}

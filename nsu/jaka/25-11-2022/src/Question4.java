import java.util.Scanner;

public class Prob_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i=0; i<10; i++){
            char ch = in.next().charAt(0);

            if(ch == 'b' || ch == 'z'){
                System.out.println("Critical error");
                break;
            }else if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                System.out.println("It's a vowel");
            }
            // System.out.println(ch);
        }

        in.close();
    }
}
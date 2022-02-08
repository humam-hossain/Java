package Lab2.src;

// 4. A person went to a City bank ATM Booth and entered his card to 
// withdraw N amount of money. 
// Now consider the below cases: 
// 1. The withdrawal amount must be greater than or equal to 500. 
// Print “INVALID AMOUNT” if the condition doesn’t match. 
// 2. Amount must be multiple of 500. Print “INVALID VALUE” if the 
// condition doesn’t satisfy. 
// 3. The maximum amount must be less than or equal to 20,000. 
// Print “EXCEEDED AMOUNT” in this case. 
// 4. If the requested amount passes all the above conditions, 
// print “TRANSACTION SUCCESSFUL”. 
// 5. Else print “Error Occurred”.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n;
        
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Withdraw = ");
			n = input.nextInt();
		}

        if(n < 500){
            System.out.println("INVALID AMOUNT");
        }else if(n % 500 != 0){
            System.out.println("INVALID VALUE");
        }else if(n >= 20000){
            System.out.println("EXCEEDED AMOUNT");
        }else if(n >= 500 && n % 500 == 0 && n <= 20000){
            System.out.println("TRANSACTION SUCCESSFUL");
        }else{
            System.out.println("Error Occurred");
        }
    }
}

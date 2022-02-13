import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		int number;
		// float fvalue;
		double dvalue;
		// char letter;
		// short svalue;
		// byte bvalue;
		// long lvalue;
		boolean check;
		String name,fname;
		
		try(Scanner input=new Scanner(System.in)){
			System.out.println("Enter your first Name: ");
			name=input.next();
			
			// input.nextLine();
			
			System.out.println("Enter your full Name: ");
			fname=input.nextLine();
			
			
			
			System.out.println("Enter a integer:");
			number=input.nextInt();
			
			System.out.println("Enter a double:");
			dvalue=input.nextDouble();
			
			// System.out.println("Enter a float:");
			// fvalue=input.nextFloat();
			
			System.out.println("Enter a boolean:");
			check=input.nextBoolean();
			
			System.out.println("Name: "+name+"\nFull name: "+fname+"\nInt: "+number+"\ndouble: "+dvalue+"\nBoolean: "+check);
		}
	}
}

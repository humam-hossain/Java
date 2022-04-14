import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] names = new String[3];
		int[] marks = new int[3];
		double[] cgpa = new double[3];		
		
		Scanner in = new Scanner(System.in); 
		for (int count = 0; count < 3; count++){ 
			names[count] = in.next(); 
			marks[count] = in.nextInt();
			cgpa[count] = in.nextDouble(); 
		}

		Employee obj=new Employee();

		try{
			obj.fCreate();
			obj.fWrite(names, marks, cgpa);
			obj.fRead();	
		}catch(Exception ex){
			System.out.println(ex);
		}

		in.close();
		
	}

}

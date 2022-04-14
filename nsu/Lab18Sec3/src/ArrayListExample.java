import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> cgpa = new ArrayList<Double>();

		
		  
		  names.add("sakib"); 
		  marks.add(78); 
		  cgpa.add(3.2);
		  
		  names.add("tamim"); 
		  marks.add(80); 
		  cgpa.add(3.6);
		  
		  names.add("Mushfiq"); 
		  marks.add(79);
		  cgpa.add(3.8);
		 
		/*
		 * Scanner in = new Scanner(System.in); for (int count = 0; count < 3; count++)
		 * { names.add(in.next()); marks.add(in.nextInt()); cgpa.add(in.nextDouble()); }
		 */
		  
		  //Hw practice all example of array using arraylist.
		  int sum=0,track=0;;
		  int max=marks.get(0);
		for (int count = 0; count < marks.size(); count++) {
			
			sum+=marks.get(count);
			if(max<marks.get(count)) {
				max=marks.get(count);
				track=count;
				
			}
			
			// System.out.println(names.get(count)+" "+marks.get(count)+"
			// "+cgpa.get(count));
		}
		System.out.println(names.get(track)+" "+marks.get(track)+" "+cgpa.get(track));
				
		System.out.println("Sum: "+sum);

	}

}

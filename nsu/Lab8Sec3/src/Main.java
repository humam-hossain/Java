import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student[] arr=new Student[3];
		String name;
		int marks;
		double cgpa;
		Scanner in=new Scanner(System.in);
		
		for(int count=0;count<arr.length;count++) {
			System.out.println("Enter student "+(count+1)+" info: ");
			System.out.print("Name: ");
			name=in.next();
			System.out.print("Marks: ");
			marks=in.nextInt();
			System.out.print("Cgpa: ");
			cgpa=in.nextDouble();
			
			arr[count]=new Student(name,marks,cgpa);
			
		}
		
		
		for(int count=0;count<arr.length;count++) {
			//arr[count].print();
			System.out.println(arr[count].toString());
			
		}
		
		Student obj=new Student();
		
		Student result=obj.max(arr);
		//System.out.println(result.name+" "+result.cgpa+" "+result.id);
		System.out.println(result.toString());

		result = obj.min(arr);
		System.out.println(result.toString());

		obj.sumAverage(arr);
		
		in.close();
		//array of object default.
		/*
		 * Student obj=new Student();
		 * 
		 * Student obj2=new Student("Sakib",153,3.6); Student obj4=new
		 * Student("Mushfiq",163,3.7); Student obj5=new Student("tamim",173,3.8);
		 * 
		 * Student[] arr= {obj2,obj4,obj5};
		 * 
		 * for(int count=0;count<arr.length;count++) { arr[count].print(); }
		 */

		/*
		 * Student obj=new Student(); Student obj2=new Student("Sakib",153,3.6); Student
		 * obj4=new Student("Mushfiq",163,3.7); Student obj5=new
		 * Student("tamim",173,3.8); Student obj3=new Student("Sakib",153);
		 * 
		 */
		/*
		 * obj2.print(); obj2.name="Nur"; obj2.cgpa=3.9; obj2.print(); obj4.print();
		 * obj4.name="hossain"; obj4.print();
		 */
	//obj4.print();
	}

}

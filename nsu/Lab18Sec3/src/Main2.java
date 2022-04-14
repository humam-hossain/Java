import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws Exception {
		Student[] arr=new Student[2];
		
		Scanner in=new Scanner(System.in);
		String name;
		int marks;
		
		for(int count=0;count<arr.length;count++) {
			name=in.next();
			marks=in.nextInt();
			arr[count]=new Student(name, marks);
		}
		
		
		Student obj=new Student();
		obj.fCreate();
		obj.fWrite(arr);
		obj.fRead();

		in.close();

	}

}

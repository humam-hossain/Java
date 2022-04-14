import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Student {
	private String name;
	private int marks;
	
	
	
	public Student() {
		
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	public void fCreate() throws Exception {
		  //File create
				File obj=new File("stdData.txt");
				
				if(obj.createNewFile()) {
					System.out.println("Created");
				}else {
					System.out.println("Already exist!");
				}
				
	}
	
	public void fWrite(Student[] arr) throws Exception {
		FileWriter fw=new FileWriter("stdData.txt");
		
		for(int count=0;count<arr.length;count++) {
			fw.write(arr[count].name+" "+String.valueOf(arr[count].marks)+"\n");
		
		}
		
		fw.close();
	}
	
	
	public void fRead() throws Exception {
		FileReader fr=new FileReader("stdData.txt");
		Scanner in=new Scanner(fr);
		Student[] arr=new Student[2];
		int count=0;
		while(in.hasNext()) {
			arr[count]=new Student();
			
			arr[count].name=in.next();
			arr[count].marks=in.nextInt();
			count++;
		}
		
		for(int count2=0;count2<arr.length;count2++) {
			System.out.println(arr[count2].name+" "+arr[count2].marks);
		}
		
		
		//Calculate and write highest scorer's info in a txt file.
		int max = arr[0].marks;
		String max_name = arr[0].name;

		if(arr[1].marks > max){
			max = arr[1].marks;
			max_name = arr[1].name;
		}

		File obj = new File("highestScore.txt");
		obj.createNewFile();
		FileWriter fw = new FileWriter("highestScore.txt");
		fw.write(max_name + " " + max);
		fw.close();

		in.close();
		
		
	}
	
	
	
	
	

}

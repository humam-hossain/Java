import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Employee {
	
	public void fCreate() throws Exception {
		  //File create
				File obj=new File("empData.txt");
				
				if(obj.createNewFile()) {
					System.out.println("Created");
				}else {
					System.out.println("Already exist!");
				}
				
	}
	
	public void fWrite(String[] names, int[] marks, double[] cgpa) throws Exception {
	
		FileWriter fw=new FileWriter("empData.txt");
		
		for(int count=0;count<names.length;count++) {
			fw.write(names[count]+" "+marks[count]+" "+cgpa[count]+"\n");
			
		}
		
		fw.close();
		
	}
	
	
	public void fRead() throws Exception {
		
		FileReader fr=new FileReader("empData.txt");
		Scanner in=new Scanner(fr);
		
		int sum=0, max=0;
		String max_name = "";
		double max_cgpa = 0;

		while(in.hasNext()) {
			String name = in.next();
			int mark = in.nextInt();
			double cg = in.nextDouble();

			System.out.println(name +" "+mark+" "+cg);
			sum+=mark;
			if(max<mark){
				max=mark;
				max_name = name;
				max_cgpa = cg;
			}
		}		
		
		File obj=new File("max.txt");
		obj.createNewFile();
		FileWriter fw=new FileWriter("max.txt");
		fw.write(max_name+" "+max+" "+max_cgpa);
        fw.close();
        
        File obj2=new File("sum.txt");
		obj2.createNewFile();
		FileWriter fw2=new FileWriter("sum.txt");
		fw2.write("sum: "+sum);
		fw2.close();

		in.close();
	}
	
}

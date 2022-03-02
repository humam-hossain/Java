
public class Student {
	public	String name;
	public int marks;
	public double cgpa;
	
	public Student(){
	
	}

	public Student(String name, int marks, double cgpa) {

		this.name = name;
		this.marks = marks;
		this.cgpa = cgpa;
	}

	void print() {
		System.out.println(name+" "+marks+" "+cgpa);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + marks + ", cgpa=" + cgpa + "]";
	}
	
	Student max(Student[] arr) {
		
		int max=arr[0].marks,track=0;
		
		for(int count=0;count<arr.length;count++) {
			if(max<arr[count].marks) {
				max=arr[count].marks;
				track=count;
				
			}
		}
		//System.out.println("Max: ");
		//System.out.println(arr[track].name+" "+arr[track].id+" "+arr[track].cgpa);
		
		return arr[track];
	}
	
	Student min(Student[] arr) {
		//print lowest scorer's info
		int min=arr[0].marks,track=0;
		
		for(int count=0;count<arr.length;count++) {
			if(min>arr[count].marks) {
				min=arr[count].marks;
				track=count;
				
			}
		}
		//System.out.println("Max: ");
		//System.out.println(arr[track].name+" "+arr[track].id+" "+arr[track].cgpa);
		
		return arr[track];
	}
	
	void sumAverage(Student[]arr) {
		//print sum average of marks
		double sum = 0;

		for(int i=0; i<arr.length; i++){
			sum += arr[i].marks;
		}

		System.out.println("Average sum of marks = " + sum/arr.length);
		//print sum average of cgpa
		sum = 0;

		for(int i=0; i<arr.length; i++){
			sum += arr[i].cgpa;
		}

		System.out.println("Average sum of cgpa = " + sum/arr.length);
	}

}

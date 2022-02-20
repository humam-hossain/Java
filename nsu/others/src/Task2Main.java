import java.util.Scanner;

public class Task2Main{
    String Full_Name;
    int Marks;
    double CGPA;
    

    public Task2Main(){
    	 Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Full_Name = sc.nextLine();

        System.out.print("mark: ");
        Marks = sc.nextInt();

        System.out.print("CGPA: ");
        CGPA = sc.nextDouble();

        System.out.println("\n");
    }

    public static void main(String[] args) {
    	
    	Task2Main[] std = new Task2Main[8];
        Task2Calculation obj = new Task2Calculation();
        
        for(int i=0; i<8; i++)
        {
            std[i] = new Task2Main();
        }

        obj.evenSum(std[1], std[3], std[5], std[7]);
        obj.oddSum(std[0], std[2], std[4], std[6]);
        obj.allSum(std);
        obj.allAverage(std);
    }
}
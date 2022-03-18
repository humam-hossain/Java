import java.util.Scanner;

public class CALCULATION extends CSE {
    private int id;

    CALCULATION(String stdName, int marks, int id){
        super(stdName, marks);
        this.id = id;
    }

    CSE average(CSE[] arr){
        return arr[0];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CSE[] std = new CSE[3];

        String name;
        int marks, id;

        for(int i=0; i<std.length; i++){
            System.out.println("Student " + (i+1));
            System.out.print("Name: ");
            name = input.next();

            System.out.print("ID: ");
            id = input.nextInt();

            System.out.print("Marks: ");
            marks = input.nextInt();

            std[i] = new CSE(name, marks, id);
            
            System.out.println();
        }

        input.close();

    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Cricketer[] data = new Cricketer[5];

        String cricketerName, seriesName;
        int totalRun, totalMatch, totalODI;

        Scanner input = new Scanner(System.in);

        for(int i=0; i<data.length; i++){
            System.out.println("Cricketer " + (i+1) + " :");
            System.out.print("Name: ");
            cricketerName = input.next();

            System.out.print("Total Run: ");
            totalRun = input.nextInt();

            System.out.print("Series Name: ");
            seriesName = input.next();

            System.out.print("Total Match: ");
            totalMatch = input.nextInt();

            System.out.print("Total ODI: ");
            totalODI = input.nextInt();

            System.out.println();
            
            data[i] = new Cricketer(cricketerName, totalRun, seriesName, totalMatch, totalODI);
        }

        input.close();

        System.out.println("Results: \n");

        try{
            data[0].t20Series(data);
            data[0].highestODI(data);

            System.out.println("Average Run: " + data[0].avgRun(data));
            data[0].avgMatch(data);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
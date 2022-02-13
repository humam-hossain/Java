// 4.Convert for loop example to while loop, do..loop from manual.

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        //for
        int number;
        try (Scanner in = new Scanner(System.in)) {
			//Hw convert this to while and do while
			int sum=0,evenSum=0,oddSum=0,oddCount=0,evenCount=0;
			double allavg, eAvg, oAvg;

			for(int count=1;count<=10;count++) {
			    System.out.println("Enter Number:  "+count);
			    number=in.nextInt();
			    sum+=number;

			    if(number%2==0) {
			        evenSum+=number;
			        evenCount++;
			    }else {
			        oddSum+=number;
			        oddCount++;
			    }
			}
			System.out.println("Sum: "+sum+"\nEvenSum: "+evenSum+"\nOddSum: "+oddSum);

			allavg=(double)sum/10;
			eAvg=(double)evenSum/evenCount;
			oAvg=(double) oddSum/oddCount;

			System.out.println("allAvg: "+allavg+"\nEvenAvg: "+eAvg+"\nOddAvg: "+oAvg);

			// while
			System.out.println("// while");
			int count=1;
			while(count<=10) {
			    System.out.println("Enter Number:  "+count);
			    number=in.nextInt();
			    sum+=number;

			    if(number%2==0) {
			        evenSum+=number;
			        evenCount++;
			    }else {
			        oddSum+=number;
			        oddCount++;
			    }
			    count++;
			}
			System.out.println("Sum: "+sum+"\nEvenSum: "+evenSum+"\nOddSum: "+oddSum);

			allavg=(double)sum/10;
			eAvg=(double)evenSum/evenCount;
			oAvg=(double) oddSum/oddCount;

			System.out.println("allAvg: "+allavg+"\nEvenAvg: "+eAvg+"\nOddAvg: "+oAvg);

			//do while
			System.out.println("// do while");
			count=1;
			do {
			    System.out.println("Enter Number:  "+count);
			    number=in.nextInt();
			    sum+=number;

			    if(number%2==0) {
			        evenSum+=number;
			        evenCount++;
			    }else {
			        oddSum+=number;
			        oddCount++;
			    }
			    count++;
			}while(count<=10);

			System.out.println("Sum: "+sum+"\nEvenSum: "+evenSum+"\nOddSum: "+oddSum);

			allavg=(double)sum/10;
			eAvg=(double)evenSum/evenCount;
			oAvg=(double) oddSum/oddCount;

			System.out.println("allAvg: "+allavg+"\nEvenAvg: "+eAvg+"\nOddAvg: "+oAvg);
		}
    }
}
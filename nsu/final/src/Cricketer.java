import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Cricketer extends Cricket implements CalculateRun, CalculateMatch{
    int totalODI;

    Cricketer(String cricketerName, int totalRun, String seriesName, int totalMatch, int totalODI){
        super(cricketerName, totalRun, seriesName, totalMatch);
        this.totalODI = totalODI;
    }

    @Override
    Cricketer highestODI(Cricketer[] data) throws Exception{
        int max = data[0].totalODI, max_id = 0;

        for(int i=1; i<data.length; i++){
            if(data[i].totalODI > max){
                max = data[i].totalODI;
                max_id = i;
            }
        }

        File file = new File("high.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("high.txt");
        
        fw.write(data[max_id].toString());

        fw.close();

        return data[max_id];
    }
    
    @Override
    void t20Series(Cricketer[] data) throws Exception{
        int min=data[0].totalMatch, min_id = 0;

        for(int i=1; i<data.length; i++){
            if(data[i].totalMatch < min){
                min = data[i].totalMatch;
                min_id = i;
            }
        }

        File file = new File("T20.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("T20.txt");
        fw.write(data[min_id].toString());

        fw.close();
    }

    @Override
    public double avgRun(Cricketer[] data){
        double sum = 0;

        for(int i=0; i<data.length; i++){
            sum += data[i].totalRun;
        }

        return (sum/data.length);
    }

    @Override
    public void avgMatch(Cricketer[] data){
        double sum = 0;

        for(int i=0; i<data.length; i++){
            sum += data[i].totalMatch;
        }

        System.out.println("Average Match: " + sum/data.length);
    }
    
    @Override
    public String toString(){
        return "Name: " + this.cricketerName + "\nTotal Run: " + this.totalRun + "\nSeriesName: " + this.seriesName + "\nTotalMatch: " + this.totalMatch + "\nTotal ODI: " + this.totalODI;
    }

}
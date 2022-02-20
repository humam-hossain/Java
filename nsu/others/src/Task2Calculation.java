public class Task2Calculation {
    void allSum(Task2Main[] std){
        int sum=0;
        
        for(int i=0; i<std.length; i++)
        {
            sum += std[i].Marks;
        }
        
        System.out.println("Sum of all marks: " + sum);
        sum = 0;
        
        for(int i=0; i<std.length; i++)
        {
            sum += std[i].CGPA;
        }
        
        System.out.println("Sum of all cgpa: " + sum);
        
    }

    double allAverage(Task2Main[] std){
        double average = 0;
        int sum=0;
        
        for(int i=0; i<std.length; i++)
        {
            sum += std[i].Marks;
        }
        average = sum/std.length;
        
        System.out.println("Average of all marks: " + average);

        sum = 0;
        
        for(int i=0; i<std.length; i++)
        {
            sum += std[i].CGPA;
        }
        
        average = sum/std.length;
        
        System.out.println("Average of all cgpa: " + average);

        return sum;
    }

    int evenSum(Task2Main std2, Task2Main std4, Task2Main std6, Task2Main std8){
        int sum = std2.Marks + std4.Marks + std6.Marks + std8.Marks;
        
        System.out.println("Sum of all even marks: " + sum);
        System.out.println("Average of all even marks: " + (double)sum/4);

        return sum;
    }

    double oddSum(Task2Main std1, Task2Main std3, Task2Main std5, Task2Main std7){
        double sum = std1.Marks + std3.Marks + std5.Marks + std7.Marks;
        
        System.out.println("Sum of all even marks: " + sum);
        System.out.println("Average of all even marks: " + sum/4);

        return sum;
    }
}
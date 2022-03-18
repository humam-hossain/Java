public class CALCULATION {
    void allSum(Student[] std){
        int sum=0;
        
        for(int i=0; i<std.length; i++){
            sum += std[i].mark;
        }
        System.out.println("Sum of all marks: " + sum);

        sum = 0;
        for(int i=0; i<std.length; i++){
            sum += std[i].cgpa;
        }
        System.out.println("Sum of all cgpa: " + sum);
    }

    double allAverage(Student[] std){
        double average = 0;
        int sum=0;
        
        for(int i=0; i<std.length; i++){
            sum += std[i].mark;
        }
        average = sum/std.length;
        System.out.println("Average of all marks: " + average);

        sum = 0;
        for(int i=0; i<std.length; i++){
            sum += std[i].cgpa;
        }
        average = sum/std.length;
        System.out.println("Average of all cgpa: " + average);

        return sum;
    }

    int evenSum(Student std2, Student std4, Student std6, Student std8){
        int sum = std2.mark + std4.mark + std6.mark + std8.mark;
        
        System.out.println("Sum of all even marks: " + sum);
        System.out.println("Average of all even marks: " + (double)sum/4);

        return sum;
    }

    double oddSum(Student std1, Student std3, Student std5, Student std7){
        double sum = std1.mark + std3.mark + std5.mark + std7.mark;
        
        System.out.println("Sum of all even marks: " + sum);
        System.out.println("Average of all even marks: " + sum/4);

        return sum;
    }
}
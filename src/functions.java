public class functions {
    Student max(Student std1, Student std2, Student std3, Student std4){
        Student max_std = new Student();

        max_std = std1;

        if(std2.mark > max_std.mark){
            max_std = std2;
        }
        
        if(std3.mark > max_std.mark){
            max_std = std3;
        }

        if(std4.mark > max_std.mark){
            max_std = std4;
        }

        return max_std;
    }

    Student min(Student std1, Student std2, Student std3, Student std4){
        Student min_std = new Student();

        min_std = std1;

        if(std2.mark < min_std.mark){
            min_std = std2;
        }
        
        if(std3.mark < min_std.mark){
            min_std = std3;
        }

        if(std4.mark < min_std.mark){
            min_std = std4;
        }

        return min_std;
    }
}

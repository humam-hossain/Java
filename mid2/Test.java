// Create a class named Office having private data members :
// companyName, location,  totalExperience.

class Office{
    private String companyName, location, totalExperience;
}

// Now create a class named ITdepartment having private data member :
// empName, age,  empId, salary.
// Two methods :
// averageAge (arr[]:ITdepartment):double - it will calculate the sum and average of age. 
// Print sum and return average. 
// highestSalary (arr[]:ITdepartment):ITdepartment - it will calculate the highest paid employee 
// information If age range 25-39.
// ITdepartment class inherit the office class.

class ITdepartment extends Office {
    private String empName, empId;
    private int age, salary;

    double averageAge(ITdepartment[] arr){
        double sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i].age;
        }

        return sum/arr.length;
    }

    ITdepartment highestSalary(ITdepartment[] arr){
        ITdepartment highest_paid;
        int max = arr[0].salary;

        for(int i=1; i<arr.length; i++){
            if(arr[i].age >= 25 && arr[i].age <= 39){
                if(arr[i].salary > max){
                    max = arr[i].salary;
                    highest_paid = arr[i];
                }
            }
        }

        return highest_paid;
    }
}

// Now create another class named HRdepartment having private data members : 
// address, designation 
// A method named:
// minSalary(arr[]:HRdepartment,arr[]:ITdepartment) : It will calculate and print the lowest paid 
// employee information of HRdepartment if employee name of ITdepartment and HRdepartment same. 
// HRdepartment class inherit the ITdepartment class. 

class HRdepartment extends ITdepartment{
    private String address, designation;

    void minSalary(HRdepartment[] arr, ITdepartment[] arr2){
        if(arr)
    }
}

// Declare necessary getter,setter, constructors and toString methods in all classes. 

// Now create a class for main method. Declare 5 objects for ITdepartment employee and 5 objects 
// for HRdepartment employee. (Note: use array of objects and user input) 
// i. Print all information using toString methods
// ii. Call all user defined methods and print outputs.
// Create a class named Office having private data members :
// companyName, location,  totalExperience.

import java.util.Scanner;

class Office{
    private String companyName, location, totalExperience;

    Office(){
        Scanner input = new Scanner(System.in);

        System.out.print("Company Name: ");
        this.companyName = input.next();

        System.out.print("Location: ");
        this.location = input.next();

        System.out.print("Total Experience: ");
        this.totalExperience = input.next();

        // input.close();
    }

    // getters
    String getCompanyName(){
        return companyName;
    }
    String getLocation(){
        return location;
    }
    String getTotalExperience(){
        return totalExperience;
    }

    // setters
    void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    void setLocation(String location){
        this.location = location;
    }
    void setTotalExperience(String totalExperience){
        this.totalExperience = totalExperience;
    }

    public String toString(){
        return "Company Name: " + this.companyName + "\nLocation: " + "\nTotal Experience: " + this.totalExperience;
    }
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

    ITdepartment(){
        super();

        Scanner input = new Scanner(System.in);

        System.out.print("Employee Name: ");
        this.empName = input.next();

        System.out.print("Employee ID: ");
        this.empId = input.next();

        System.out.print("Age: ");
        this.age = input.nextInt();

        System.out.print("Salary: ");
        this.salary = input.nextInt();

        // input.close();
    }

    // getters
    String getEmpName(){
        return this.empName;
    }
    String getEmpId(){
        return this.empId;
    }
    int getAge(){
        return this.age;
    }
    int getSalary(){
        return this.salary;
    }

    // setters
    void setEmpName(String empName){
        this.empName = empName;
    }
    void setEmpId(String empId){
        this.empId = empId;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSalary(int salary){
        this.salary = salary;
    }

    double averageAge(ITdepartment[] arr){
        double sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i].age;
        }

        System.out.println("Sum: " + sum);

        return sum/arr.length;
    }

    ITdepartment highestSalary(ITdepartment[] arr){
        ITdepartment highest_paid = arr[0];
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

    public String toString(){
        return super.toString() + "\nEmployee Name: " + this.empName + "\nEmployee ID: " + this.empId + "\nAge: " + this.age + "\nSalary: " + this.salary;
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

    HRdepartment(){
        super();

        Scanner input = new Scanner(System.in);

        System.out.print("Address: ");
        this.address = input.next();

        System.out.print("Designation: ");
        this.designation = input.next();

        // input.close();
    }

    // getters
    String getAddress(){
        return this.address;
    }
    String getDesignation(){
        return this.designation;
    }

    // setters
    void setAddress(String address){
        this.address = address;
    }
    void setDesignation(String designation){
        this.designation = designation;
    }

    void minSalary(HRdepartment[] arr, ITdepartment[] arr2){
        // bujhi nai ki chailo
    }

    public String toString(){
        return super.toString() + "\nAddress: " + this.address + "\nDesignation: " + this.designation;
    }
}

// Declare necessary getter,setter, constructors and toString methods in all classes. 

// Now create a class for main method. Declare 5 objects for ITdepartment employee and 5 objects 
// for HRdepartment employee. (Note: use array of objects and user input) 
// i. Print all information using toString methods
// ii. Call all user defined methods and print outputs.

public class Main{
    public static void main(String[] args){
        ITdepartment[] it_emp = new ITdepartment[5];
        HRdepartment[] hr_emp = new HRdepartment[5];
        
        System.out.println("IT Department");
        for(int i=0; i<it_emp.length; i++){
            System.out.println("Employee No. " + (i+1));
            it_emp[i] = new ITdepartment();
            System.out.println();
        }

        System.out.println("HR Department");
        for(int i=0; i<hr_emp.length; i++){
            System.out.println("Employee No. " + (i+1));
            hr_emp[i] = new HRdepartment();
            System.out.println();
        }

        System.out.println("Info of IT Department");
        for(int i=0; i<it_emp.length; i++){
            System.out.println("Employee No. " + (i+1));
            System.out.println(it_emp[i]);
            System.out.println();
        }

        System.out.println("Info of HR Department");
        for(int i=0; i<hr_emp.length; i++){
            System.out.println("Employee No. " + (i+1));
            System.out.println(hr_emp[i]);
            System.out.println();
        }

        System.out.println("Average: " + it_emp[0].averageAge(it_emp));
        System.out.println(it_emp[0].highestSalary(it_emp));

        hr_emp[0].minSalary(it_emp, hr_emp);        
    }
}
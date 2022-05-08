# CSE215_Fall_Final_Exam

##### 1. [15Points] ​In Onion Garments Ltd, the employees can be divided into two types based on their way of earning. The first type of employees gets a fixed monthly salary at the end of each month. The salary is calculated by summing basic salary, 30% of the basic salary as house rent, and 5% of basic salary as medical allowance. Employees can also work on an hourly basis who get a salary depending on the number of hours they work in a month. The salary is calculated by multiplying the hours and hourly pay rate. This rate varies from employee to employee. 
 
##### a. [5 points] Design a class Employee with its attributes and methods including an abstract method calculateSalary() which calculates the salary of each employee and a protected attribute which keeps the salary amount. Design two classes FixedSalaryEmployee and HourlyRateEmployee that inherit the Employee class. The class descriptions are given in the UML diagram below. 
 
##### b. [10 points] The sub-classes have to implement the abstract method calculateSalary(). The toString() method is overridden in the two sub-classes to print the name, mobile number, and salary. 

* Employee.java
```java
public abstract class Employee{
    private String name;
    private String mobileNum;
    protected double salary;

    Employee(String name, String mobileNum){
        this.name = name;
        this.mobileNum = mobileNum;
    }

    abstract double calculateSalary();
    @Override
    public String toString(){
        return "Name: " + this.name + "\nMobile Number: " + this.mobileNum;
    }
}
```
* FixedSalaryEmployee.java
```java
public class FixedSalaryEmployee extends Employee {
    double basicSalary;

    FixedSalaryEmployee(String name, String mobileNum, double basicSalary) {
        super(name, mobileNum);
        this.basicSalary = basicSalary;
    }
    
    @Override
    double calculateSalary(){
        return this.basicSalary + 0.3 * this.basicSalary + 0.05 * this.basicSalary;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalary: " + this.calculateSalary();
    }
}
```

* HourlyRateEmployee.java
```java
public class HourlyRateEmployee extends Employee{
    double perHourRate;
    double totalHours;

    HourlyRateEmployee(String name, String mobileNum, double perHourRate, double totalHours) {
        super(name, mobileNum);
        this.perHourRate = perHourRate;
        this.totalHours = totalHours;        
    }

    @Override
    double calculateSalary(){
        return this.perHourRate * this.totalHours;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSalary: " + this.calculateSalary();
    }
}
```

##### 2. [5 points]​ What are the differences between ​compiler ​and ​interpreter?

| Interpreter                                                                                                                                              | Compiler                                                                                                                                                   |
|----------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Translates program one statement at a time.                                                                                                              | Scans the entire program and translates it  as a whole into machine code.                                                                                  |
| Interpreters usually take less amount of  time to analyze the source code. However,  the overall execution time is comparatively  slower than compilers. | Compilers usually take a large amount of  time to analyze the source code.However,  the overall execution time is  comparatively faster than interpreters. |
| No Object Code is generated, hence are  memory efficient.                                                                                                | Generates Object Code which further  requires linking, hence requires  more memory.                                                                        |
| Programming languages like JavaScript, Python, Ruby use interpreters.                                                                                    | Programming languages like C, C++, Java use compilers.                                                                                                     |

##### 3. [5 points]​ ​Explain the purpose of the following method: 
```java
static int[] stripZeros( int[] list ) { 
    int count = 0; 
    for (int i = 0; i < list.length; i++) { 
        if ( list[i] != 0 ) 
            count++; 
    } 
    int[] newList; 
    newList = new int[count]; 
    int j = 0; 
    for (int i = 0; i < list.length; i++) { 
        if ( list[i] != 0 ) { 
            newList[j] = list[i]; 
            j++; 
        } 
    } 
    return newList; 
}
```

stripZeros() is a static method that takes a list of numbers and strips zeros from the lists. stripZeros() takes an integer array 'list' as perameter. Then it counts non-zero integers in the 'list' array and creates a new array of integer 'newList' with length equals to the count of non-zero integers. Then the method assign non-zero integers from 'list' array into 'newList' array. 'newList' array will contain every non-zeros from 'list' array in order. Then stripZeros() returns the 'newList' array.

##### 4. [5points]​Describe Implicit and Explicit casting in the context of the object type. Why is casting necessary? 
 
##### 5. [5points]​Can you prevent overriding a method without using the final modifier? Describe with code.

##### 6. [5points]Explain with code examples: Java does not mandate you to write code to catch unchecked exceptions. 
 
##### 7. [5points]​Can abstract class implement an interface in Java? Do they require to implement all methods of the interface?

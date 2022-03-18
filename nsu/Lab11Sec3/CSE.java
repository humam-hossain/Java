// Create a class named CSE with two private variables stdName,marks and a method

// CSE average(CSE[] arr):It will calculate and print the sum and average of marks if name length is 6.

// Create another class named CALCULATION with one private variables  id and 
// a overridden method CSE average(CSE[] arr): It will print the students information if 
// name start with S and length is greater than 6. Calculation class inherit the CSE class.

// Take three CSE students information using array of object from user input in main method.
// Then print all info  and results
// Note: Decalare necessary constructors and toString methods


public class CSE{
    private String stdName;
    private int marks;

    CSE(String stdName, int marks){
        this.stdName = stdName;
        this.marks = marks;
    }

    CSE average(CSE[] arr){
        if(arr.stdName.length == 6)
    }

    public String toString(){
        return "Student Name: " + stdName + ", Marks: " + marks;
    }
}
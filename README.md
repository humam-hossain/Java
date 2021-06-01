# Notes on Java
---

## Basics

```java
public class ClassName{ //class declaration
  public static void main(String[] args){ // method declaration
    //tasks
  }
}
```

1. Java programs have __at least__ one class and one ```main()``` method.
2. The ```main()``` method runs the tasks of the program.
3. Curly braces ``` {} ```mark the scope of a class and method.
4. Semicolons ``` ; ``` mark the end of a statement.
5. Java is a compiled language. Compilers transform code into an executable class.
6. sigle line comment ``` //.... ``` , multiple lines comment ``` /* ..... */ ```
7. Java is a case-sensitive language.



## Variables

* When variable is used to represent a fixed value, it is referred to as a ___literal___.
* A variable starts with a valid letter, or a $, or a _. 

### Data types

___Primitive Data Types :___ Primitive datatypes are types of data __built-in__ to the Java system. The three main primitive types are 
  1. ```int``` - The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive. 
  2. ```double``` - double can hold decimals as well as very large and very small numbers. The maximum value is 1.7976931348623157 E+308, which is approximately 17 followed by 307 zeros. The minimum value is 4.9 E-324, which is 324 decimal places.
  3. ```boolean``` - ``` true ``` & ``` false ```
  4. ```char``` - The char data type can hold any character, like a letter, space, or punctuation mark. 

```java
// primitive datatypes
// datatype variableName
int age;
double salaryRequirement;
boolean isEmployed;
```
___Object Data Type :___ 
  1. ```String``` - holds sequences of characters. There are __two ways__ to create a ```String``` object: using a ```String``` literal or calling the ```String``` class to create a new ```String``` object.
    
   * A String literal is any sequence of characters enclosed in double-quotes (""). Like primitive-type variables, we declare a String variable by specifying the type first: 
    
```java
String str_name = "characters";
```
   * We could also create a new String object by calling the String class when declaring a String like so:
```java
String salutations = new String("Hello World");
```
> There are subtle differences in behavior depending on whether you create a ```String``` using a ```String``` literal or a ```new String``` object.

### The order of operations: 
> parentheses -> multiplication -> division -> modulo -> addition -> subtraction


### ```final``` keyword
To declare a variable with a value that cannot be ___manipulated___, we need to use the ```final``` keyword.
```java
final datatype variable_name = value;
```

### Escape Sequences
Escape characters begin with the character ```\```.
* The ```\"``` escape sequence allows us to add quotation marks " to a ```String``` value.
* Using the ```\\``` escape sequence allows us to place backslashes in our ```String``` text.
* we place a ```\n``` escape sequence in a ```String```, the compiler will output a new line of text.

### ```static``` Checking
Java programs will not compile if a variable is assigned a value of an incorrect type. This is a bug, specifically a type ___declaration bug___. Static typing helps because bugs are caught during programming rather than during execution of the code. When bugs are not caught at compilation, they interrupt execution of the code by causing runtime errors. The program will crash.

Java’s ```static``` typing helps programmers avoid runtime errors, and thus have much safer code that is free from bugs.

## Object Oriented Programming (OOP) - Classes & Objects
---
___Declaration___
```java
public class ClassName{
  public static void main(String[] args){
    //instructions
  }
}
```
# Constructor
* To create an instance(object), we need to call or invoke the constructor within ```main()``` like ```new ClassName()```.

```java
public class ClassName {
  // Constructor method
  public ClassName() {
    // instructions for creating a class instance
  }  
 
  public static void main(String[] args) {
    // body of main method
    ClassName objectName = new ClassName();
    System.out.println(objectname);
  }
}
```
1. Running the program invokes ```main()```.
2. We create an instance so we move from ```main()``` to ```ClassName()```.
3. The code inside ```ClassName()``` runs.
4. When ```ClassName()``` finishes execution, we return to ```main()```.

We can initialize a __reference-type__ variable without assigning it a reference if we utilize the special value ```null```. Something that is ```null``` has no value; if we were to assign ```null``` to an object, it would have a void reference.
```java
ClassName objectName = new ClassName();
System.out.println(objectName); // Prints: <memory of the objectName>
 
objectName = null; // change value to null
System.out.println(thunderBird); // Prints: null
```
> It’s important to note that if we use a ```null``` reference to call a method or access an instance variable, we will receive a ```NullPointerException``` error.

When an object is created, the constructor sets the ___initial state___ of the object. The ___state___ is made up of associated data that represents the characteristics of an object.


## Modifier
```public``` is an __access level__ modifier that allows other classes to interact with this class.

## Exceptions
* ```ArithmeticException``` - dividing any number by ```0``` will throw an ```ArithmeticException``` error as a result. 
* ```NullPointerException``` - using a ```null``` reference to call a method or access an instance variable will throw a ```NullPointerException``` error.








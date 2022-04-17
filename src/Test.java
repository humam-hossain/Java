// What is wrong in the following code?
public class Test {
  public static void main(String[] args) {
    Person[] persons = {new Person(3), new Person(4), new Person(1)};
    java.util.Arrays.sort(persons, (first, second)->{
      return first.getId() - second.getId();
    });

    for(int i=0; i<persons.length; i++){
      System.out.println(persons[i].getId());
    }
  }
}
class Person {
  private int id;
 
  Person(int id) {
    this.id = id;         
  }

  int getId(){
    return this.id;
  }
}
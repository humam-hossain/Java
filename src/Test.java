import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test{
  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("in");
      Scanner in = new Scanner(fr);
      String course = "[";

      File file = new File("course");
      FileWriter fw = new FileWriter("course");
      
  
      while(in.hasNextLine()){
        course += '"'+in.nextLine()+'"' + ",";
      }
      course+= "]";

      fw.write(course);
      fw.close();
  
      in.close();

      
      
    } catch (Exception e) {

    }
  }
}
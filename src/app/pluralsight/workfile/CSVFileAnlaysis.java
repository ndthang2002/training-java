package app.pluralsight.workfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.stream.Stream;

import app.pluralsight.workfile.model.Person;

public class CSVFileAnlaysis {
  public static void main(String[] args) {
    
    Path path =Path.of("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\files\\data.csv");
    
//    try (BufferedReader reader =Files.newBufferedReader(path)){
//      String line = reader.readLine();
//      while(line !=null) {
//        if(!line.startsWith("#")){
//          String[] elements = line.split(";");
//          String name = elements[0];
//          int age = Integer.parseInt(elements[1]);
//          
//          String city = elements[2];
//          Person p = new Person(name,age,city);
//          System.out.println("p = "+p);
//          
//        }
//        line = reader.readLine();
//        
//      }
//    } catch (IOException ioe) {
//      // TODO: handle exception
//      
//    }
    
    try (Stream<String> lines = Files.lines(path)){
      lines.filter(line-> !line.startsWith("#"))
      .flatMap(CSVFileAnlaysis::lineToPerson)
      .forEach(System.out::println);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
  
  private static Stream<Person> lineToPerson(String line ){
    try {
      
      String[] elements = line.split(";");
      String name = elements[0];
      int age = Integer.parseInt(elements[1]);
      String city = elements[2];
      Person p = new Person(name ,age ,city);
      return  Stream.of(p);
      
    } catch (Exception e) {
      
      // TODO: handle exception
    }
    return Stream.empty();
  }
}

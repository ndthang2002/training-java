package app.pluralsight.workfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

  public static void main(String[] args) throws IOException {
    
    Path path = Path.of("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\files\\demo.txt");
     boolean check = Files.exists(path);
  System.out.println(check);
  BufferedReader reader = Files.newBufferedReader(path);
  String line = reader.readLine();
 
  while(line !=null) {
    System.out.println(line);
    line = reader.readLine();
  }
  
  }
}

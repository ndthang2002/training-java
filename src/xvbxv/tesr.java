package xvbxv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class tesr {
  public static void main(String[] args) throws IOException {
    
    Path path = Paths.get("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\ReadFile.java");
     boolean check = Files.exists(path);
    BufferedReader reader = Files.newBufferedReader(path);
    
    String line = reader.readLine();
    while ( line!=null) {
      System.out.println(line);
      line = reader.readLine();
    }
  }
}

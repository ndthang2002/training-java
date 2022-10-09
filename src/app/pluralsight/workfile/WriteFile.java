package app.pluralsight.workfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
  public static void main(String[] args) throws IOException {
    //read 
    Path paths = Path.of("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\files\\demo.txt");
    BufferedReader reader = Files.newBufferedReader(paths);
    String line = reader.readLine();
    Path path = Path.of("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\files\\demo2.txt");
    boolean check = Files.exists(path);
    
    BufferedWriter writer = Files.newBufferedWriter(path);
    
    try {
       
       writer.write("toi la thang");
       while(line != null) {
         writer.write(line);
         writer.newLine();
         line = reader.readLine();
       }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }finally {
       writer.flush();
    writer.close();
    }
   
   
  }
}

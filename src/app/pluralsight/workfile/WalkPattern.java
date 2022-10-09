package app.pluralsight.workfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WalkPattern {
  //truy cap thu muc bang stream
  public static void main(String[] args) throws IOException {
     Path path = Path.of("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\files\\media");
     
     boolean directory = Files.isDirectory(path);
     System.out.println("Directory = " + directory);
     
     Stream<Path> stream = Files.walk(path);
     //dem folder va file
     long count =stream.count();
     // dem folder
     long countDirs =
     Files.walk(path)
           .filter(p -> Files.isDirectory(p))
           .count();
     // dem file
//     long countFiles =
//     Files.walk(path)
//     .filter(p -> Files.isRegularFile(p))
//     .count();
     long countFiles =
         Files.walk(path)
         .filter(Files::isRegularFile)
         .count();
     
     
     System.out.println("count =" +count);
     System.out.println("count  dirs=" + countDirs);
     System.out.println("count files =" + countFiles);
     
  }
}

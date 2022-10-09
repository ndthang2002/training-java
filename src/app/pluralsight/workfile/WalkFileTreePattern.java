package app.pluralsight.workfile;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreePattern {
  // truy cap thu muc bang workfiletree
  public static void main(String[] args) throws IOException {
    Path path = Path.of("C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\workfile\\files\\media");
    boolean directory=   Files.isDirectory(path);
    System.out.println("Directory = " + directory);
    
    var visitor =  new FileVisitor<Path>() {
    private long countFiles =0L;
    private long countDirs =0L;
    
    
      @Override
      public FileVisitResult
      preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // TODO Auto-generated method stub
        countDirs++;
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult 
      visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        // TODO Auto-generated method stub
        countFiles++;
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        // TODO Auto-generated method stub
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        // TODO Auto-generated method stub
        return FileVisitResult.CONTINUE;
      }
    };
    
    
    Files.walkFileTree(path, visitor);
    System.out.println("count files = " + visitor.countFiles);
    System.out.println("count dirs = " + visitor.countDirs);

  }
}

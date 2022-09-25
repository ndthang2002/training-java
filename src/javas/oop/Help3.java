package javas.oop;

import java.io.IOException;

import org.junit.Ignore;

public class Help3 {
  public static void main(String[] args) throws IOException {
    int choice;
    int count=0;
    System.out.println("nhap mot ky tu bat ky");
    do { 
      choice=(char)System.in.read();
      count=count+1;
    } while (choice !='.');
    System.out.println(count);
  }
}

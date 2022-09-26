package javas.oop;

import java.awt.Choice;
import java.io.IOException;

public class HelpJavaDemo {

  public static void main(String[] args) throws IOException {
 
    char choice ,ignore;
   HelpJavas hel = new HelpJavas();
 
   
    for(;;) {
      do {
        hel.showmenu();
        choice =(char)System.in.read();
        do {
          ignore= (char) System.in.read();
        } while (ignore !='\n');
        
      } while (!hel.isValid(choice));
      if(choice =='q')break;
      System.out.println("\n");
      hel.helpon(choice);
    }
    System.out.println("fjnads");
  }
}

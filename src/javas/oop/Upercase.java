package javas.oop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Upercase {
public static void main(String[] args) throws IOException {
  
 ArrayList<Character > arr = new ArrayList<Character>();
 char uper = 0;
 System.out.println("nhập ky tu hoa :");
 for(int i=0; i<10;i++) {
   arr.add((char) System.in.read());
 }
 int i = 0;
 while( i<arr.size()) {
   int kytu = arr.get(i);
    uper=(char) (kytu+32);
    i++;
 }
  System.out.println("ký tưj thường là: "+uper);
  
 
 
  
 

  
}
}

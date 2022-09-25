package javas.oop;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class SoNguyenTo {
public static void main(String[] args) throws IOException {
  
  // số nguyên tóo là số chia hết cho 1 và chính nó 
 
  int flag=0;
  
  
  for (int i=2; i< 100; i++) {
   
    if(chech(i)) {
      System.out.println(i);
    }
  }
  // doc ky tu tu ban phim
  char ch ;
  ch = (char) System.in.read();
  System.out.println(ch);
}
// kiểm tra từng phần tử đó có phải số nguyên tố không 
 static boolean chech(int n) {
  
   if(n<2) {
     return true;
   }
   int i = 2;
   while(i<n) {
     if(n%i==0) {
       return false;
     }
     i++;
   }
   return true;
   
}
}

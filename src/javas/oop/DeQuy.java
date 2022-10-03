package javas.oop;

public class DeQuy {

  public static void main(String[] args) {
    Factorial fac = new Factorial();
    System.out.println("gia thua cua 4 la : " + fac.factR(4));
    fac.p();
    
   
    
  }
}

class Factorial {
  int factR(int n) {
    int result;
    if (n == 0) {
      return 1;
    }
    result = factR(n - 1) * n;
    return result;
  }

  //
 static int count =0;
 static void p() {
   count++;
   if(count <=5) {
     System.out.println("hello "+ count);
     p();
   }
 }
}
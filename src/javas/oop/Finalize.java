package javas.oop;

// thu gom rac
public class Finalize {
public static void main(String[] args) {
  int count;
  FDemo ob = new FDemo(0);
  for(count =1; count<100000000;count++) {
    ob.generator(count);
  }
}
}

class FDemo {
  int x;
  FDemo(int i) {
    x = i;
  }
   
  // duoc goi khi doi tuong bi tai su dung 
  protected void finalize() {
    System.out.println("finalizing "+x);
  }
  
  // toa ra mot doi tuong ngay lap tuc se bi pha huy
  void generator(int i) {
    FDemo o= new FDemo(i);
  }
}

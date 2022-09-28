package javas.oop;

public class Varargs {
  // đối số có độ dài biến đổi
  static void varTest(int... v) {
    System.out.println("số lượgn đối số:" + v.length);
    System.out.println("nội dung : ");
    for (int i = 0; i < v.length; i++) {
      System.out.println("arg " + i + ":" + v[i]);
      System.out.println();
    }
  }
  
  // tinh tong cac so int truyen vao
  static void varTestInt(int ...I) {
    int sum =0;
    for(int in : I) {
      sum=sum+in;
    }
    System.out.println("tong la cac so truyen vao la : "+sum);
  }

  public static void main(String[] args) {
    varTest(10);
    varTest(4, 2, 5, 7, 2);
    varTest();
   varTestInt(1,3,4,5);
  }
}

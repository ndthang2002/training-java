package Operaters;

public class Function {

  public static void main(String[] args) {
    test(0, 1,4);
    System.out.println(calculateInterest(3, 5, 2030));
  }
  
  static void test(int h,int j,int count) {
    if(count<5) {
      System.out.println("tra ve");
      return;
    }
  int sum =h+j;
 for( int i=0; i<count;i++) {
   
   System.out.println(sum);
     return;
 }

}
  static double calculateInterest(double amt ,double rate,int years) {
    double interest = amt * rate* years;
    return interest;
  }
}


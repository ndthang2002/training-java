package javas.oop;

public class DebugTest {
public static void main(String[] args) {
  int firtInt =7;
  int secondInt = 8;
  int sum = add(firtInt,secondInt);
  System.out.println(" the sum is : "+ sum);
  if(secondInt%2==1) {
    System.out.println("");
  }
}

private static int add(int int1, int int2) {
  int sum  = int1 + int2;
  return sum;
}
}

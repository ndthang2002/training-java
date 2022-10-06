package Operaters;

public class Switch {
 public static void main(String[] args) {
  double [] leftVal = {100.0,43.0,3.2,564.0};
  double [] rightVal = {50.0,13.0,3.2,76.00};
  char[] opCodes = {'a','b','d','s'};
  double[] result = new double[opCodes.length];
  for(int i=0; i<opCodes.length;i++) {
    result[i]= execute(opCodes[i], leftVal[i], rightVal[i]);
  }
  for(double re : result) {
    System.out.println(re);
  }
}
 
 
 static double  execute(char opCode , double leftVal , double rightVal) {
   double result;
   switch (opCode) {
     case 'a':
     {
       result= leftVal+rightVal;
       break;
     }
     case 'b':
     {
       result= leftVal*rightVal;
       break;
     }
     case 'd':
     {
       result= leftVal-rightVal;
       break;
     }
     case 's':
     {
       result = leftVal+leftVal;
       break;
     }
     default:
       result=0;
       break;
   }
   return result;
 }
}
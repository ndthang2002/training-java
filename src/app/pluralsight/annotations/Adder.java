package app.pluralsight.annotations;

@CommandKeyword(value ="add")
public class Adder  implements MathProcessing{
@Override
//@CommandKeyword(value="dfad")
public double doCalculation(double leftVal, double rightVal) {
  return leftVal + rightVal;
}
}

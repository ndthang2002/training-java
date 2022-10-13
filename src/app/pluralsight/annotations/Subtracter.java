package app.pluralsight.annotations;

import java.util.jar.Attributes.Name;

@CommandKeyword(value ="sub")
public class Subtracter implements MathProcessing{

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    // TODO Auto-generated method stub
    return leftVal -  rightVal;
  }
  
}

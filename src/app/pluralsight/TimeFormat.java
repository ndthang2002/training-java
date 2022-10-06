package app.pluralsight;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;

public class TimeFormat {
  public static void main(String[] args) {

    double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
    double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
    char[] opCodes = { 'd', 'a', 's', 'm' };
    double[] results = new double[opCodes.length];
    executeInteractively();
//    if(args.length ==0) {
//      for(int i=0;i<opCodes.length;i++) {
//        results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
//      }
//      for (double currentResult : results)
//        System.out.println(currentResult);
//    }else if(args.length ==1&& args[0].equals("interactive"))
//    {
//      executeInteractively();
//    }else if(args.length ==3) {
//      performOperation(args);
//    }
//    else {
//      System.out.println("please provide an opertion ");
//    }
    
  
  }

  static void chehcRelationship(Instant otherInstant) {
    Instant nowInstant = Instant.now();
    if (otherInstant.compareTo(nowInstant) > 0) {
      System.out.println("Instant is in the future");
    } else if (otherInstant.compareTo(nowInstant) < 0) {
      System.out.println("Instant is in the past");
    } else {
      System.out.println("Instant is now");
    }
  }

  private static void performOperation(String[] parts) {
    char opCode = opCodeFromString(parts[0]);
    if (opCode == 'w') {
      handLeWhen(parts);
    } else {
      double leftVal = valueFromWord(parts[1]);
      double rightVal = valueFromWord(parts[2]);
      double result = execute(opCode, leftVal, rightVal);
      displayResult(opCode, leftVal, rightVal, result);
    }
  }

  private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
    char symbol = symbolFromOpCode(opCode);
    String output = String.format("%.3f %c %.3f =%.3f", leftVal, symbol, rightVal, result);
    System.out.println(output);
  }

  private static char symbolFromOpCode(char opCode) {
    char[] opCodes = { 'a', 's', 'm', 'd' };
    char[] symbols = { '+', '-', '*', '/' };
    char symbol = ' ';
    for (int index = 0; index < opCodes.length; index++) {
      if (opCode == opCodes[index]) {
        symbol = symbols[index];
        break;
      }
    }

    return symbol;
  }

  private static void handLeWhen(String[] parts) {
    LocalDate startDate = LocalDate.parse(parts[1]);
    long daysToAdd = (long) valueFromWord(parts[2]);
    LocalDate newDate = startDate.plusDays(daysToAdd);
    String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
    System.out.println(output);

  }

  static char opCodeFromString(String operationName) {
    char opcode = operationName.charAt(0);
    return opcode;
  }

  static double valueFromWord(String word) {
    String[] numberWords = { "xero", "one", "two", "three", "five", "six" };
    double value = -1d;
    for (int index = 0; index < numberWords.length; index++) {
      if (word.equals(numberWords[index])) {
        value = index;
        break;
      }
    }
    if (value == -1d)
      value = Double.parseDouble(word);
    return value;
  }

  static double execute(char opCode, double leftVal, double rightVal) {
    double result;
    switch (opCode) {
      case 'a':
        result = leftVal + rightVal;
        break;
      case 's':
        result = leftVal - rightVal;
        break;
      case 'm':
        result = leftVal * rightVal;
        break;
      case 'd':
        result = rightVal != 0 ? leftVal / rightVal : 0.0d;
        break;
      default:
        System.out.println("Invalid opCode: " + opCode);
        result = 0.0d;
        break;
    }
    return result;
  }

  static void executeInteractively() {
    System.out.println("Enter an operation and two numbers:");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    String[] parts = userInput.split("");
    performOperation(parts);
  }
}

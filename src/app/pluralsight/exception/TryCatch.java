package app.pluralsight.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
  public static void main(String[] args) {

//   int i=12;
//   int j=2;
//     
//   try {
//       int result = i/(j-2);
//       System.out.println(result);
//  }catch(ArithmeticException eA) {
//    System.out.println("Invalid math operation -"+ eA.getMessage());
//  }catch (Exception e) {
//    // TODO: handle exception
//    System.out.println("Error:"+e.getMessage());
//    e.printStackTrace();
//  }
//   

    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(
          "C:\\dev\\tools\\workspace\\training-java\\src\\app\\pluralsight\\exception\\democalculation.txt"));
      processFile(reader);
      // ngoai le chi tiet
    } catch (FileNotFoundException ef) {
      System.out.println("File not found :" + args[0]);
    } catch (IOException ex) {
      System.out.println("Error readfile:" + ex.getMessage());

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("error processing file : " + e.getMessage());
    }
//    finally {
//      try {
//        System.out.println("closing file -" +args[0]);
//        reader.close();
//      } catch (Exception e) {
//        // TODO: handle exception
//        System.out.println("error closing file");
//      }
//    }

  }

  private static void processFile(BufferedReader reader) throws IOException{
    String inputString = null;
    while ((inputString = reader.readLine()) != null)
      try {
            performOperation(inputString);
      } catch (InvalidStatementException ex ) {
        // TODO: handle exception
      System.out.println(ex.getMessage()+" - " +inputString);
      writevalidStatementExceptionToLog(ex, inputString);
      }
  }
  static void writevalidStatementExceptionToLog(InvalidStatementException ex , String inputLine) {
    System.out.println("");
    System.out.println("******");
    System.out.println("Information written to log system");
    System.out.println("*********");
    
    System.out.println(ex.getMessage() + "-" +inputLine);
    if(ex.getCause()!=null)
      System.out.println("caused by " + ex.getCause());
    ex.printStackTrace(System.err);
  }

  private static void performOperation(String inputLine) throws InvalidStatementException {
    String[] parts = inputLine.split(" ");
    if (parts.length != 3) {
      throw new InvalidStatementException("statement must have 3 parts : operation leftVal rightVal");
    }

    MathOperration operaton = MathOperration.valueOf(parts[0].toUpperCase());
    int leftVal = valueFromWord(parts[1]);
    int rightVal = valueFromWord(parts[2]);
    int result = execute(operaton, leftVal, rightVal);
    System.out.println(inputLine + " =" + result);
  }

  static int valueFromWord(String word) {
    String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    int value = -1;
    for (int index = 0; index < numberWords.length; index++) {
      if (word.equals(numberWords[index])) {
        value = index;
        break;
      }
    }
    if (value == -1d)
      value = Integer.parseInt(word);
    return value;
  }

  static int execute(MathOperration operation, int leftVal, int rightVal) {
    int result = 0;
    switch (operation) {
      case ADD:
        result = leftVal + rightVal;
        break;
      case SUBTRACT:
        result = leftVal - rightVal;
        break;
      case MULTIPLY:
        result = leftVal * rightVal;
        break;
      case DIVIDE:
        // tao ngoai le
        if (rightVal == 0) {
          throw new IllegalArgumentException("zero rightVal not permitted width divide operation");

        }
        result = leftVal / rightVal;
        break;
    }
    return result;
  }

  // khai bao cac hang so can dung
  public enum MathOperration {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
  }
}

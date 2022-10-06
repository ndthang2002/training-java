package app.pluralsight;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Scanner;

import org.junit.platform.commons.util.ToStringBuilder;

public class StringExample {
  public static void main(String[] args) {
StringFormat();
    //
     
      
  }
  static void StringFormat() {
     int w=32, x=235,y=481,z=12;
      int ival = 1234567;
      double dval =1234567.0d;
      String s1 = String.format("%d", w);
      String s5 = String.format("W:%04d X:%04d", w, x);
      String s2 = String.format("%,d", ival);
      String s4 = String.format("%,.2f", dval);
      System.out.println("sfda");
      System.out.println(s1);
      System.out.println(s5);
      System.out.println(s2);
      System.out.println(s4);
      
      int val1 =100 ,val2=200,val3=300;
      String va = String.format("%2$d %1$d %3$d", val1,val2,val3);
      System.out.println(va);
  }

  static void methodString() {
    String hihi = "thang";
    int h = 9;
    String chuoi = hihi.valueOf(h);
    System.out.println(hihi.concat("long"));
    System.out.println(hihi.charAt(3));
    System.out.println(hihi.contains("t"));
    System.out.println(hihi.compareTo("tdd"));
    System.out.println(hihi.valueOf(4));
    System.out.println(chuoi);
  }

  static void executeInteractively() {
    System.out.println();
    Scanner nhap = new Scanner(System.in);
    String userNhap = nhap.nextLine();
    String[] parts = userNhap.split("");
    performOperation(parts);
  }

  private static void performOperation(String[] parts) {
    char opCode = opCodeFromString(parts[0]);
    double leftVal = valueFromWord(parts[1]);
    double rightVal = valueFromWord(parts[2]);
    double result = execute(opCode, leftVal, rightVal);

    System.out.println(result);
  }

  private static void displayResult(char opCode,double leftVal,double rightVal, double result) {
    char symbol = symbolFromCode(opCode);
    StringBuilder buider = new StringBuilder(20);
    buider.append(leftVal);
    buider.append("");
    buider.append(symbol);
    buider.append("");
    buider.append(rightVal);
    buider.append("=");
    buider.append(result);
    String output = buider.toString();
    System.out.println(output);
  }
 private static char symbolFromCode(char opCode) {
   char[] opCodes = {'d','g','g','q'};
   char[] symbols = {'+','-','*','/'};
   char symbol =' ';
     for(int i=0; i<opCodes.length;i++) {
       if(opCode==opCodes[i]) {
         symbol =symbols[i];
         break;
       }
     }
     return symbol;
 }

  static double execute(char opCode, double leftVal, double rightVal) {
    double result;
    switch (opCode) {
      case 'a': {
        result = leftVal + rightVal;
        break;
      }
      case 'b': {
        result = leftVal * rightVal;
        break;
      }
      case 'd': {
        result = leftVal - rightVal;
        break;
      }
      case 's': {
        result = leftVal + leftVal;
        break;
      }
      default:
        result = 0;
        break;
    }
    return result;
  }

  static char opCodeFromString(String operationName) {
    char opcode = operationName.charAt(0);
    return opcode;

  }

  static double valueFromWord(String word) {
    String[] numberWords = { "thang", "hieh", "mjinh", "nghi" };
    double value = 0d;
    for (int i = 0; i < numberWords.length; i++) {
      if (word.equals(numberWords[i])) {
        value = i;
        break;
      }
    }
    return value;
  }
}

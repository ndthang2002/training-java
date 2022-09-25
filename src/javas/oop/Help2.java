package javas.oop;

import java.io.IOException;

import org.junit.Ignore;

public class Help2 {
  public static void main(String[] args) throws IOException {
    int choice;
    char ignore;
    do {
      System.out.println(
          "trợ giúp về lệnh :\n1.\tif \n2.\tswitch\n3. \tfor\n4.\twhile \n5 \tdo-while \n6.\tbreak \n7.\tcontinue \nChọn một câu lệnh .");
      choice = (char) System.in.read();
      switch (choice) {
        case '1': {
          System.out.println(
              "câu lệnh if : \n  if(điều  kiên==tre) { làm gì đó }\n câu lệnh else : \n else{làm việc còn lại nếu ìf false }");
          break;
        }
        case '2': {
          System.out.println(" lệnh switch case: \n switch(biểu thức)\n case hằng :{ làm gì đó và break;}");
          break;
        }
        case '3': {
          System.out.println(" vòng lặp for ");
          break;
        }
        case '4': {
          System.out.println(" vòng lặp while");
          break;
        }
        case '5': {
          System.out.println("vòng lặp do-while ");
          break;
        }
        case '6': {
          System.out.println(" break dùng để thoát");
          break;
        }
        case '7': {
          System.out.println("continue");
          break;
        }
        default: {

        }

          System.out.println(" vui  lòng chon\'q' de thoat");

          do {
            ignore = (char) System.in.read();

          } while (ignore != '\n');
      }
    } while (choice < '1' | choice > '7' & choice != 'q');

  }
}

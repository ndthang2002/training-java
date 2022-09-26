package javas.oop;

public class HelpJavas {

  void helpon(int what) {
    switch (what) {
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
    }
    System.out.println();
  }
  public void showmenu() {
    System.out.println(
        "trợ giúp về lệnh :\n1.\tif \n2.\tswitch\n3. \tfor\n4.\twhile \n5 \tdo-while \n6.\tbreak \n7.\tcontinue \nChọn một câu lệnh \'q' de thoat .");
  }
   boolean isValid(int ch ) {
     if(ch<'1'|| ch>'7'& ch!='q') return false;
     else return true;
   }

}

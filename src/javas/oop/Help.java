package javas.oop;

import java.io.IOException;

public class Help {
public static void main(String[] args) throws IOException {
  
  System.out.println("trợ giúp về lệnh :\n1.\tif \n2.\tswitch\n Chọn một câu lệnh .");
  int choice =(char) System.in.read();
  switch (choice) {
    case '1': {
       System.out.println("câu lệnh if : \n  if(điều  kiên==tre) { làm gì đó }\n câu lệnh else : \n else{làm việc còn lại nếu ìf false }");
       break;
    }
    case '2':{
      System.out.println(" lệnh switch case: \n switch(biểu thức)\n case hằng :{ làm gì đó và break;}" );
      break;
    }
    default:

System.out.println(" vui  lòng chỉ chọn 1 trong 2");
  }
}
}

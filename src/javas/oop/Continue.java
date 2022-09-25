package javas.oop;

public class Continue {
  public static void main(String[] args) {

    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        continue;// bỏ qua lệnh print và quay lại vòng lặp

      }
      System.out.println(i);
    }

    // continnue đặt lable

    contilable: for (int i = 0; i < 10; i++) {
      System.out.print("\nhien thi ra i :" + i + "\t");
      for (int j = 0; j < 10; j++) {
        if (j == 5) {
          continue contilable;
        }
        System.out.print("hien thi j ra: " + j);
      }
    }

    // test

   for(int i=0; i< 10 ; i++) {
     if (i>5) {
       continue;
   
     }
     System.out.println(i);
   }
  }
}

package javas.oop;

import java.io.IOException;

public class ForIf {
  public static void main(String[] args) throws IOException {

    // chuyển đổi galon sang lít với galon= 3.7854
    double liter, counter;
    counter = 0;
    for (int i = 1; i < 100; i++) {
      liter = i * 3.7854;
      System.out.println(" doi galons qua lit " + i + "= " + liter);
      counter++;

      if (counter == 10) {
        System.out.println();
        counter = 0;
      }
    }

    // trong luong cua ban tren mat trang
    int trongLuongBan = 59;
    int trenMatTrang = trongLuongBan * (100 / 17);
    System.out.println(" trong luong cua ban tren mat trang la : " + trenMatTrang);

    // chuyen doi inch snag met
    double inch, met;
    int count = 0;
    for (inch = 1; inch < 100; inch++) {
      met = inch * 39.37;
      System.out.println(inch + " bang  : " + met + " met");
      count++;

      if (count == 12) {
        System.out.println();
        count = 0;

      }
    }

    // gán
    int x, y, z;
    x = y = z = 100;
    // gán tự chuyển kiểu
    int i = 9;
    float h = i;

    // ép kiểu
    int A = 565;
    char show = (char) A;
    System.out.println(show);

    byte hi = (byte) A;
    long lo = (long) A;
    System.out.println(hi);
    System.out.println(lo);
//    System.out.println("ấn phím s để dừng vòng lặp.");
//      for(int i1=0;(char)System.in.read()!='s';i1++) {
//        System.out.println("lan lap "+i);
//      }
     
      int sum = 0 ;
      for(int ii=1; ii<=5; sum+=ii++) {
       //ko co than
      }
      System.out.println(sum);
      
      //vong for long
      for ( i=2;i<=100;i++) {
        System.out.print("ước chung của "+i+" là :");
        for(int j=2;j<i;j++) {
          if(i%j==0) {
            System.out.println(j);
          }
        }
      }
      //for (gia tri khoi tao ; dieu kien ; bước nhay)
      for (i=100;i>0;i=i-2) {
        System.out.println("haidhuasd"+i);
      }
      
      for (; i<10;i++) {
        System.out.println(i+"");
        if(i%2==0)  continue;// bỏ qua dòng lệnh bên dưới 
         
        System.out.println(i+"sdfjdf");
      }
      
      for (i=0;i<10;i++) {
      int hihi = i==5?4/2:0;
      System.out.println(hihi);
      }
      
    

  }
  
}

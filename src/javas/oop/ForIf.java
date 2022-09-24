package javas.oop;

public class ForIf {
public static void main(String[] args) {
  
  // chuyển đổi galon sang lít với galon= 3.7854
  double liter ,counter;
  counter =0;
  for (int i =1 ; i< 100; i++) {
    liter= i* 3.7854;
    System.out.println(" doi galons qua lit "+i+"= "+liter);
    counter++;
    
    if(counter == 10) {
      System.out.println();
      counter=0;
    }
  }
  
  // trong luong cua ban tren mat trang 
  int trongLuongBan =59;
  int trenMatTrang = trongLuongBan * (100/17);
  System.out.println(" trong luong cua ban tren mat trang la : "+trenMatTrang);
  
  // chuyen doi inch snag met
  double inch ,met;
  int count=0;
   for (inch=1 ; inch< 100;inch++) {
      met= inch * 39.37 ;
      System.out.println(inch+" bang  : " +met+" met");
      count++;
      
      if (count==12) {
        System.out.println();
        count=0;
        
      }
   }
  
   
   // gán 
   int x,y,z;
   x=y=z=100;
   // gán tự chuyển kiểu
   int i=9;
   float h= i;
   
   // ép kiểu 
   int A = 565;
   char show =(char) A;
   System.out.println(show);
   
   byte hi =(byte) A;
   long lo = (long) A;
   System.out.println(hi);
   System.out.println(lo);
}
}

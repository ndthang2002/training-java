package javas.oop;

public class Break {

  public static void main(String[] args) {
System.out.println(Array.hihi);    
    int i;
    for(i=1;i<4;i++) {
      one:{
        two:{
          three:{
            System.out.println("\ni bang "+i);
            if(i == 1)break one;
            if(i ==2 )break two;
            if(i==3)break three;
            System.out.println("hihi");
          }
          System.out.println("sau khoi ma thu ba");
        }
        System.out.println("sau khoi ma thu hai ");
      }
      System.out.println("sau khoi ma thu nhat ");
      
    }
    System.out.println("sau vong lap for");
    
    // test 2
     
    System.out.println("hihi:");
  label :   for (i=0;i<50;i++) 
     {
      System.out.println(i);
   ;
          if(i>20) {
           System.out.println("hai muoiw");
            break label;
         }
      }
     
  // test 3
  lable1: for (int x =0;x<5;x++) {
    for(int y =0; y<5;y++) {
      if(y==2) {
        break lable1;
        
      }
      System.out.print(x+y+" \n");
    }
   
  } 
  System.out.println("tới đây !");
  // khác nhau về vị trí đặt lable
       for(int x=0;x<5;x++) 
       labe2: {     
         for(int y=0; y<5;y++) {
           if(y==2) {
             break labe2;
           }
           System.out.print(x+" "+y);
           System.out.println("svj");
         }
         
       }
       System.out.println("toi day thoi");
  }
}

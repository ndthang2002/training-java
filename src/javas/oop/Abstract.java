package javas.oop;

public class Abstract {
public static void main(String[] args) {
  LopConn lc = new LopConn();
  int h= lc.area();
  System.out.println(h);
  int n = lc.hihi();
  System.out.println(n);
}
}

abstract class LopChaa{
  // cac phuong thuc truu tuong
  abstract int area();
  abstract int hihi();
  
  // ngan chan viẽc ghi de 
  final void test() {
    
  }
}
class LopConn extends LopChaa{
  int w=9;
int h=3;
  @Override
  int area() {
    // TODO Auto-generated method stub
    int sum =w+h;
    return sum;
  }

  @Override
  int hihi() {
    // TODO Auto-generated method stub
   int nhan = w*h;
    
    return nhan;
  }
  
//  void test() {  lỗi không thể ghi đè
//  }

  // bat buoc ghi de phuong thuc truu tuong cua lop cha

  

  
}
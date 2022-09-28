package javas.oop;

import java.text.NumberFormat.Style;

public class KeThua {
public static void main(String[] args) {
  
  LopCon lc = new LopCon();
  lc.setHeight(5);
  lc.setWidth(5);
  System.out.println(lc.nhan());
  
  // khoi tao doi tuong co tham so
  LopCon lc1 = new LopCon("sfad",3,4);
  System.out.println(lc1.nhan());
  lc1.showStyle();
}
}

class LopCha{
 private double width;
  private  double height;
  
  
  void tinhtong() {
    int sum ;
    sum = (int) (width+height);
  }
  double getWidth() {return width;}
  double getHeight() {return height;}
  void setWidth(double w) { width= w;}
  void setHeight(double h) {height=h;}
  
  public LopCha() {
    width=height=0;
  }
  public LopCha(double x) {
    width=height=0;
  }
  
  public LopCha(double w , double h) {
    this.width =w;
    this.height=h;
  }
}
class LopCon extends LopCha{
  
 private String style;
  // khong co quyen truy cap vao lop cha vi co private
  /*
  int nhan() {
    width=10;
    height=20;
    return width *height;
  }
  */
  
  //su dung phuong thuc de truy cap
  int nhan () {
    
    return (int) (getWidth()* getHeight());
  }
  // phuong thuc khoi tao mac dinh 
  public LopCon() {
    super();
  }
  public LopCon( double x) {
    super(x);
  }
  //phuong thuc khoi tao co tham so 
  // them doi so i cua lop con
  public LopCon(String i,double w, double h) {
    super(w,h);
    style=i;
  }
  void showStyle() {
    super.setHeight(3);// su dung super de truy cap thanh vien lop cha
    System.out.println(getHeight());
    System.out.println("day la style :"+style);
  }
}

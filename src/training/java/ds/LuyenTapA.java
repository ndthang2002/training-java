package training.java.ds;

public class LuyenTapA extends LuyenTapE {
// kế thừa từ abstract class không có từ khóa abtract thì phải định nghĩa lại hàm (tinhtong);
 int a=5;
 int b=5;
 int tong ;
	@Override
	void tinhtong() {
		// TODO Auto-generated method stub
		  tong = a+a;
		  System.out.println(tong);
	
	}
	@Override
		void tinhhieu() {
			// TODO Auto-generated method stub
			super.tinhhieu();
		}

}

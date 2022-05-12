package training.java.ds;

public class Luyentap2 implements Luyentapinterface{

	 int a=1;
	 int b=3;
	 int c=1;
	 int tong ;
	@Override
	public  void tinhtong() {
		// TODO Auto-generated method stub
		tong = a+b+c;
		System.out.println(tong);
	}
	@Override
	public void xuat() {
		System.out.println(" vẫn có thể sửa");
	}
	public void hah() {
		System.out.println("hhha");
	}

	
}

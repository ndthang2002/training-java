package training.java.ds;

public class  Luyentap1 implements Luyentapinterface {
int a=5;
int b=4;
int tong ;
	@Override
	public void tinhtong() {
		// TODO Auto-generated method stub
		tong = a+b;	
		System.out.println(tong);
		
		
	}
	@Override
		public void xuat() {
			// TODO Auto-generated method stub
			Luyentapinterface.super.xuat();
		}

}

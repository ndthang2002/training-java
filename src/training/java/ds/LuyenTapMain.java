package training.java.ds;

public class LuyenTapMain {

	public static void main(String[] args) {
		
		// interface
		LuyenTapD lt = new LuyenTapD();
		lt.tinhtong();
		lt.xuat();
		LuyenTapC lt2 = new LuyenTapC();
		lt2.tinhtong();
		lt2.xuat();
		
		// abstract
	LuyenTapA ab = new LuyenTapA();
	ab.tinhtong();
	ab.tinhhieu();
	LuyenTapB ab2 = new LuyenTapB() {};
	ab2.sleep();
		
	}

}

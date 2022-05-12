package training.java.ds;

public class Luyentapmain {

	public static void main(String[] args) {
		
		// interface
		Luyentap1 lt = new Luyentap1();
		lt.tinhtong();
		lt.xuat();
		Luyentap2 lt2 = new Luyentap2();
		lt2.tinhtong();
		lt2.xuat();
		
		// abstract
	Luyentap_ab1 ab = new Luyentap_ab1();
	ab.tinhtong();
	ab.tinhhieu();
	Luyentap_ab2 ab2 = new Luyentap_ab2() {};
	ab2.sleep();
		
	}

}

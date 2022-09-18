package training.java.ds;

public interface LuyenTapI {

	void tinhtong();
	default void xuat() {
		System.out.println("tong cua ban do");
	}
	
}

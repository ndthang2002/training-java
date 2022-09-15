package abstract_hinh;

public class HinhTron extends Hinh {
 private double r;

	public HinhTron(ToaDo toado, double r) {
	super(toado);
	this.r = r;
}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double tinhdientich() {
		// TODO Auto-generated method stub
		
		return Math.PI*this.r*this.r;
	}

}

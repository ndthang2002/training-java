package abstract_hinh;

public class HinhChuNhat extends Hinh {
private double chieurong , chieucao;	
public HinhChuNhat(ToaDo toado) {
		super(toado);
		// TODO Auto-generated constructor stub
	}
public HinhChuNhat(ToaDo toado, double chieurong, double chieucao) {
	super(toado);
	this.chieurong = chieurong;
	this.chieucao = chieucao;
}
@Override
public double tinhdientich() {
	// TODO Auto-generated method stub
	return this.chieurong*this.chieucao;
}


}

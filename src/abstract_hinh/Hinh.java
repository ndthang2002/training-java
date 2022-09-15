package abstract_hinh;

public abstract class Hinh {

	protected ToaDo toado;

	public Hinh(ToaDo toado) {

		this.toado = toado;
	}

	public ToaDo getToado() {
		return toado;
	}

	public void setToado(ToaDo toado) {
		this.toado = toado;
	}
	public abstract double tinhdientich();
	
	
}

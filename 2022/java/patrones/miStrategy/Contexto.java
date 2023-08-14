package miStrategy;

public class Contexto {
	private CuponDescuento cupon;

	public Contexto(CuponDescuento cupon) {
		super();
		this.cupon = cupon;
	}


	public CuponDescuento getCupon() {
		return cupon;
	}


	public void setCupon(CuponDescuento cupon) {
		this.cupon = cupon;
	}
	


}

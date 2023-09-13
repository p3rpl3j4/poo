
public class Circulo implements IFiguraGeometrica {
	private final double PI = 3.1415;
	private float radio;

	public Circulo(float radio) {
		// TODO Auto-generated constructor stub
		this.radio = radio;
	}

	@Override
	public double area() {
		return this.PI * this.radio * this.radio;
	}

	@Override
	public double perimetro() {
		return 2* this.PI * this.radio;
	}

	@Override
	public  void dibujar() {
		System.out.println("Dibujo un círculo");
		
	}


	@Override
	public void saludar() {
		System.out.println("Saludo círculo");

	}

}

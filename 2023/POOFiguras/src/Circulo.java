public class Circulo extends FiguraGeometrica {
	private final double PI = 3.1415;
	private float radio;

	public Circulo() {
		super();
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
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
}

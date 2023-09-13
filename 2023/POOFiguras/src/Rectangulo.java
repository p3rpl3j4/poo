public class Rectangulo extends FiguraGeometrica {
	
	private float lado1;	
	private float lado2;

	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return lado1 * lado2;
	}

	@Override
	public double perimetro() {
		return (lado1 + lado2) * 2;
	}

	@Override
	public void dibujar() {
		System.out.println("Me dibujo, soy un rectángulo");
	}

}

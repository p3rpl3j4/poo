//ejemplo de uso de clase abstracta para modelar polimorfismo
//Esta clase define métodos abstractos (sin funcionalidad)
//para que las subclases hereden la forma (prototipo de meétodo), 
//pero implementen su propia manera de hacerlo
public abstract class FiguraGeometrica {

	public FiguraGeometrica() {

	}
	
	//métodos abstractos
	//RECORDAR que una abstract class puede NO tenerlos
	public abstract double area();
	
	public abstract double perimetro();
	
	public abstract void dibujar();
	
	//método concreto
	public void saludar() {
		System.out.println("Te saludo desde clase " + this.getClass().getName());
	}
}
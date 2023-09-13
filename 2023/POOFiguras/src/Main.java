
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
				
		/*--------------------------------------------------*/
		FiguraGeometrica[] figuras = new FiguraGeometrica[8];
	
		FiguraGeometrica fig1 = new Circulo();
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();
		Rectangulo rec3 = new Rectangulo();

		//Puedo crear objetos y asignarnos al arreglo:
		figuras[0] = fig1;
		figuras[1] = rec1;
		figuras[2] = c1;
		figuras[3] = c2;
		figuras[4] = c3;
		figuras[5] = rec2;
		figuras[6] = rec3;
		//también puedo instanciar sobre la marcha:
		figuras[7] = new Circulo();
	
		//ejemplo de cómo distintas figuras responden al mismo mensaje:
		for (int i=0; i<7; i++) {
			figuras[i].saludar();
			figuras[i].dibujar();
			
			//va a mostrar 0 porque no seteamos atributos para calcular el area
			System.out.println("Mi area es: " + figuras[i].area());
		}		
	}
}


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Declaro una variable de tipo IFiguraGeometrica
		IFiguraGeometrica miFigura;
		
		//Instancio un circulo y lo guardo en una variable IFiguraGeometrica
		miFigura = new Circulo(21);
		
		//Instancio un arreglo de IFiguraGeometrica
		IFiguraGeometrica[] figuras = new IFiguraGeometrica[8];

		Circulo c1 = new Circulo(10);
		Circulo c2 = new Circulo(24);
		Circulo c3 = new Circulo(7);
		
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();
		Rectangulo rec3 = new Rectangulo();
		
		figuras[0] = c3;
		figuras[1] = rec1;
		figuras[2] = c1;
		figuras[3] = c2;
		figuras[4] = c3;
		figuras[5] = rec1;
		figuras[6] = rec2;
		figuras[7] = rec3;
	
		for (int i=0; i<7;i++) {
			figuras[i].saludar();
			figuras[i].dibujar();
		}
	}
}

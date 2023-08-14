package prueba;

public class Main {

	public static void main(String[] args) {		
		Auto auto1, auto2;
		
		auto1 = new Auto();
		auto2 = new Auto ("Renault", "Clio");
		
		
		auto2.acelerar();
		
		
		//auto1.marca = "Aguante chevrolet";
		
		auto1.setMarca("Aguante chevrolet");
		auto1.mostrar();
		auto2.mostrar();
		
		
	}

}
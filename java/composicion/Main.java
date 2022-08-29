package composicion;

public class Main {

	public static void main(String[] args) {
		Automovil autitoA = new Automovil("Fiat", "Uno", "Gris topo");
		
		Automovil autitoB = new Automovil("Fiat", "Uno", "Gris topo", new Motor ("Toyota"));

	}

}

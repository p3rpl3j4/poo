package misAnimales;

public class Pato extends Animal {

	public Pato() {
	}

	public Pato(String nombre) {
		super(nombre);
	}

	public Pato(String nombre, int edad) {
		super(nombre, edad);
	}

	public Pato(String nombre, int edad, int matricula) {
		super(nombre, edad, matricula);
	}

	@Override
	public void emitirSonido() {
		System.out.println("Cuak cuak");
	}
}

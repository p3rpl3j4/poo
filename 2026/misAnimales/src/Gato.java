package misAnimales;

public class Gato extends Animal {

	public Gato() {
	}

	public Gato(String nombre) {
		super(nombre);
	}

	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}

	public Gato(String nombre, int edad, int matricula) {
		super(nombre, edad, matricula);
	}

	@Override
	public void emitirSonido() {
		System.out.println("Miau");
	}
}

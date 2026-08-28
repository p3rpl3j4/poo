package misAnimales;

public class Perro extends Animal implements IAdoptable {

	public Perro() {
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, int edad, int matricula) {
		super(nombre, edad, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSonido() {
		System.out.println("Guau Guau");
	}

	@Override
	public void desparasitar() {
		
	}

	@Override
	public int adoptar() {
		//falta implementar
		return 0;
	}

}

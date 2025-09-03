package mascotas;

public class Tortuga extends Animal {

	@Override
	public void emitirSonido() {
		System.out.println("Soy " + this.getClass() + "y emito un sonido");
	}

}

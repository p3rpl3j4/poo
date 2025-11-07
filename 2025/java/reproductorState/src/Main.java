package ejemploState;

public class Main {

	public static void main(String[] args) {
		ReproductorContexto reproductor = new ReproductorContexto(new Detenido());

		System.out.println("---- Primera prueba: Reproducir y Pausar ----");
		reproductor.presionarPlay(); // Output: El reproductor está reproduciendo.
		reproductor.presionarPlay(); // Output: El reproductor está pausado.
		reproductor.presionarPlay(); // Output: El reproductor se ha reanudado.

		System.out.println();
		System.out.println("---- Segunda prueba: Detener ----");
		reproductor.presionarStop(); // Output: El reproductor se ha detenido.
		reproductor.presionarStop(); // Output: El reproductor ya está detenido.
		reproductor.presionarPlay(); // Output: El reproductor está reproduciendo.
	}
}

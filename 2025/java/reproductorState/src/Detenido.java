package ejemploState;

public class Detenido implements Estado {

	public Detenido() {
		super();
	}

	@Override
	public void presionarPlay(ReproductorContexto reproductor) {
		System.out.println("El reproductor comienza a reproducir");
		reproductor.setEstado(new Reproduciendo());	}

	@Override
	public void presionarStop(ReproductorContexto reproductor) {
		System.out.println("El reproductor ya está detenido");
	}

}

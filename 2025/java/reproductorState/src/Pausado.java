package ejemploState;

public class Pausado implements Estado {

	@Override
	public void presionarPlay(ReproductorContexto reproductor) {
		System.out.println("El reproductor se reanuda (sale de pausa)");
		reproductor.setEstado(new Reproduciendo());	}

	@Override
	public void presionarStop(ReproductorContexto reproductor) {
		System.out.println("El reproductor ya está detenido");
		reproductor.setEstado(new Detenido());

	}

}

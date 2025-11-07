package ejemploState;

public class Reproduciendo implements Estado {

	public Reproduciendo() {
		
	}

	@Override
	public void presionarPlay(ReproductorContexto reproductor) {
		//El botón Play es también Pause. Si estoy reproduciendo, entonces me pauso
		System.out.println("Pausé el reproductor.");
		reproductor.setEstado(new Pausado());
		
	}

	@Override
	public void presionarStop(ReproductorContexto reproductor) {
		System.out.println("Detuve el reproductor");
		reproductor.setEstado(new Detenido());
	}

}

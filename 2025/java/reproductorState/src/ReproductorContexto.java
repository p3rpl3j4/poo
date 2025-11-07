package ejemploState;

public class ReproductorContexto {
	private Estado estado;
	
	public ReproductorContexto(Estado estado) {
		this.estado = estado;
	}

	public void setEstado(Estado estado ) {
		this.estado = estado;
	}
	
	public void presionarPlay() {
		this.estado.presionarPlay(this);
	}

	public void presionarStop() {
		this.estado.presionarStop(this);
	}
}

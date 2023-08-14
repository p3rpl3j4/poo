package asoc_simple;

public class Alquiler {
	private Persona locatario;
	private Inmueble inmueble;
	private float montoPorMes;
	private int duracionEnMeses;
	
	
	public Alquiler(Persona locatario, Inmueble inmueble, float montoPorMes, int duracionEnMeses) {
		super();
		this.locatario = locatario;
		this.inmueble = inmueble;
		this.montoPorMes = montoPorMes;
		this.duracionEnMeses = duracionEnMeses;
	}
	
	public Persona getLocatario() {
		return locatario;
	}
	public void setLocatario(Persona locatario) {
		this.locatario = locatario;
	}
	public Inmueble getInmueble() {
		return inmueble;
	}
	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	
	public float getMontoPorMes() {
		return montoPorMes;
	}
	public void setMontoPorMes(float montoPorMes) {
		this.montoPorMes = montoPorMes;
	}
	public int getDuracionEnMeses() {
		return duracionEnMeses;
	}
	public void setDuracionEnMeses(int duracionEnMeses) {
		this.duracionEnMeses = duracionEnMeses;
	}
}

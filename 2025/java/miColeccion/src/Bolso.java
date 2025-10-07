public class Bolso<T> {
	private T contenido;
	
	public void guardarAlgo (T contenido) {
		this.contenido = contenido;
	}
	
	public T obtenerAlgo () {
		return this.contenido;
	}
}

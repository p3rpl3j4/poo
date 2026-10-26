package eventos;

public class Observador {
	private String nombre;
	private String correo;
	
	
	public Observador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void actualizar(Evento e) {
		System.out.println("hay evento:" + e.getDescripcion());
		
	}
}

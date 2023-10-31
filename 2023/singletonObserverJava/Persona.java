package singletonObserverJava;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int documento;
	private TipoDocumento tipoDocumento;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Persona) {
			Persona otra = (Persona)obj;
			
			if (otra.getDocumento() == this.documento && otra.getTipoDocumento() == otra.tipoDocumento)
				return true;
		}
		
		return super.equals(obj);
	}
	
	
}

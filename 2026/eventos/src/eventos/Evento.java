package eventos;

import java.util.Date;

public class Evento {
	private int tipo;
	private String descripcion;
	private Date fecha;

	public Evento(){}

    public Evento(int tipo, String descripcion){
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

	public Evento(String descripcion) {
        this.descripcion = descripcion;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
    
    

}

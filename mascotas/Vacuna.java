package mascotas;

import java.util.Date;

public class Vacuna {
	private String droga;
	private int lote;
	private Date fechaDeAplicación;
	
	public Vacuna(String droga, int lote, Date fechaDeAplicación) {
		super();
		this.droga = droga;
		this.lote = lote;
		this.fechaDeAplicación = fechaDeAplicación;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public Date getFechaDeAplicación() {
		return fechaDeAplicación;
	}

	public void setFechaDeAplicación(Date fechaDeAplicación) {
		this.fechaDeAplicación = fechaDeAplicación;
	}
	
	
}

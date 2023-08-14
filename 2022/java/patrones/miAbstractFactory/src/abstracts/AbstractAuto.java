package abstracts;

public abstract class AbstractAuto {
	private String modelo;
	private String marca;
	private String color;
	private int cantPuertas;
	
	public abstract void mostrarCaracteristicas();
	
	

	public AbstractAuto(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

}

package agregacion;

public class Automovil {
	private String marca;
	private String modelo;
	private String color;
	private Componente [] componentes;
	
	public Automovil(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Componente [] getComponentes() {
		return componentes;
	}
	public void setComponentes(Componente [] componentes) {
		this.componentes = componentes;
	}

}

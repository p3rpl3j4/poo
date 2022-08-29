package composicion;


public class Automovil {
	private String marca;
	private String modelo;
	private String color;
	private Motor motor;
	
	public Automovil(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = new Motor("Toyota");
	}
	public Automovil(String marca, String modelo, String color, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}


}

package automotor;

public class Vehiculo {
	private String marca;
	private String modelo;
	
	/*Este atributo debería ser privado.
	Lo hacemos público sólo para probar modificadores de acceso desde Main
	*/
	public String color;
	
	
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehiculo(String marca, String modelo, String color) {
		super();
		this.setMarca(marca);
		this.modelo = modelo;
		this.color = color;
	}	

	public void acelerar() {
		System.out.println("RunRunRun desde clase Vehiculo");
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
	
	public void mostrar () {
		System.out.println("Soy de tipo: " + this.getClass().getName());
		System.out.println(this.getMarca());
		System.out.println(this.getModelo());
	}
}

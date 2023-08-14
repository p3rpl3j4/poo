package prueba;

public class Auto {
	
	private String marca;
	private String modelo;
	
	public Auto() {
		this.marca = "Ford";
	}
	
	public Auto (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void mostrar () {
		System.out.println(this.marca);
		System.out.println(this.modelo);
	}
	
	public void acelerar () {
		System.out.println("RunRunRun");
	}
}

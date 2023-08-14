package miDecorator;

public class AutoBase implements Auto {
	String nombre;
	
	
	public AutoBase(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arracar() {
		System.out.println("AUTO BASE: arrancar" + this.nombre);
	}

	@Override
	public void frenar() {
		System.out.println("AUTO BASE: frenar"+ this.nombre);
		
	}

	@Override
	public void acelerar() {
		System.out.println("AUTO BASE: acelerar"+ this.nombre);
		
	}

}

package modelo;

import java.util.TreeSet;

public class EmpresaSingleton {
	private String nombre;
	private String dirección;
	private TreeSet<Mascota> mascotas;
	
	private static EmpresaSingleton empresaSingleton = new EmpresaSingleton("Patitas TW", "Mitre 655"); 
	
	

	private EmpresaSingleton(String nombre, String dirección) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
	}
	
	

	public static EmpresaSingleton getInstance() {
		return empresaSingleton;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public TreeSet getMascotas() {
		return mascotas;
	}
	public void setMascotas(TreeSet mascotas) {
		this.mascotas = mascotas;
	}
	
	
}

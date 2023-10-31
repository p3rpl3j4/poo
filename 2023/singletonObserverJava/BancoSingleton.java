package singletonObserverJava;

public class BancoSingleton {
	private static BancoSingleton bancoSingleton = new BancoSingleton();
	private String nombre;
	private EmpleadoBanco gerente;
	private String domicilio;
	private CuentaBancaria[] cuentasBancarias;
	
	
	private BancoSingleton() {
	}
	
	public static BancoSingleton getInstance( ) {
		return bancoSingleton;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EmpleadoBanco getGerente() {
		return gerente;
	}
	public void setGerente(EmpleadoBanco gerente) {
		this.gerente = gerente;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public CuentaBancaria[] getCuentasBancaras() {
		return cuentasBancarias;
	}
	public void setCuentasBancaras(CuentaBancaria[] cuentasBancaras) {
		this.cuentasBancarias = cuentasBancaras;
	}
	
	public void imprimirCuentas(){
		
		for(CuentaBancaria cuenta : this.cuentasBancarias) {
			
			System.out.println(String.format("%s, %d, %.2f", cuenta.getCliente().getNombreCompleto(), cuenta.getNumeroCuenta(), cuenta.getSaldo()));
		}	
	}

}

package bnc;

public class BancoSingleton {
	
	private String nombre;
	private String domicilio;
	private Empleado gerente;
	private Cuenta [] cuentas;

	
	//Atributo singleton
	private static BancoSingleton miBanco = new BancoSingleton();
	
	private BancoSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//en el modelo se llama getBancoSingleton()
	public static BancoSingleton getBancoSingleton() {
		return miBanco;
	}
	

	public void imprimirCuentas() {
		System.out.println("Cliente 	|	Numero de cuenta	 | 		Saldo");
		for(Cuenta c :this.cuentas )
			System.out.println(c.getCliente().toString()+ " | "+ c.getNro() + "|"+ c.obtenerSaldo());
	}


	protected void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
}

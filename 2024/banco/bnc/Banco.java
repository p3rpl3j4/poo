package bnc;

public class Banco {
	
	private String nombre;
	private String domicilio;
	private Empleado gerente;
	private Cuenta [] cuentas;

	
	//Atributo singleton
	public static Banco miBanco = new Banco();
	
	private Banco() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//en el modelo se llama getBancoSingleton()
	public static Banco getBancoSingleton() {
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

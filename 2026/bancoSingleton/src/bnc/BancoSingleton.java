package bnc;

public class BancoSingleton {
	
	private static BancoSingleton banco = new BancoSingleton();
	private String nombre;
	private String domicilio;
	private Empleado gerente;
	private Cuenta [] cuentas;

		
	private BancoSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static BancoSingleton getBanco () {
		return banco;
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

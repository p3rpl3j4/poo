package monedasFactory;

public class Main {
	
	public static void main(String[] args) {
		FabricaDeMonedas fabrica = new FabricaDeMonedas();
		
		//instancio una moneda de oro pidiéndole a la fábrica que me de una de ellas
		Moneda miMoneda =  fabrica.getMoneda(TipoMoneda.ORO);
		miMoneda.descripcion();
		
		//Ahora puedo pedirle que me de una moneda de cobre
		miMoneda = fabrica.getMoneda(TipoMoneda.COBRE);
		miMoneda.descripcion();

	}

}

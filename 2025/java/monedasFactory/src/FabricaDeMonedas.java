package monedasFactory;

public class FabricaDeMonedas {

	public FabricaDeMonedas() {
	}
	
	public Moneda getMoneda(TipoMoneda tipo) {
		switch(tipo) {
			case ORO: 
				return new MonedaDeOro(); 
				//break;
			case PLATA:
				return new MonedaDePlata();
			case COBRE:
				return new MonedaDeCobre();
			default:
				throw new IllegalArgumentException();
		}
	}
}

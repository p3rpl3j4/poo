package miStrategy;

public class Main {

	public static void main(String[] args) {
		Contexto contexto = new Contexto(getAlgoritmo ("debito"));	
		contexto.getCupon().calcularDescuento();
		
		contexto = new Contexto(getAlgoritmo ("bitcoin"));
		contexto.getCupon().calcularDescuento();

	}

	public static CuponDescuento getAlgoritmo (String formaPago) {
		if (formaPago.equals("debito")) 
			return new DescuentoPorDebito();
		else
			if (formaPago.equals("efectivo")) 
				return new DescuentoPorEfectivo();
			else
				if (formaPago.equals("bitcoin"));	
					return new DescuentoPorBitcoin();
	}	
}


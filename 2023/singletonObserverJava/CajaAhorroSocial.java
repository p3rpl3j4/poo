package singletonObserverJava;

public class CajaAhorroSocial extends CajaAhorro {
	
	private Persona[] autorizadosExrtaccion;

	public Persona[] getAutorizadosExrtaccion() {
		return autorizadosExrtaccion;
	}

	public void setAutorizadosExrtaccion(Persona[] autorizadosExrtaccion) {
		this.autorizadosExrtaccion = autorizadosExrtaccion;
	}
	
	@Override
	public double extraer(Persona persona, double monto) {
	
		boolean puedeExtraer = this.getCliente().equals(persona);
		
		if (!puedeExtraer) {
			for(Persona autorizado : this.autorizadosExrtaccion) {
				puedeExtraer = autorizado.equals(persona);

				if (puedeExtraer)
					break;
			}
		}
		
		if (puedeExtraer)
			return super.extraer(persona, monto);
		else 
			return 0;
	}
	
}

package mascotas;

/**
 * Representa la adoptabilidad de un animal.
 */
public interface IAdoptable {
	
	/**
	 * Registra la patente de un animal
	 */
	public void registrar();
	
	/**
	 * Registra la vacuna de un animal
	 */
	public void vacunar();
	
	/**
	 * Registra la desparacitación de un animal
	 */
	public void desparacitar();
}

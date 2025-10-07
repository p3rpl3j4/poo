
public class Main {

	public static void main(String[] args) {
		GestorDeCuenta gestor = new GestorDeCuenta();
		
		try {
			gestor.gestionar();
		} catch (SosUnSecoException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

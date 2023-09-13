import mis_excepciones.SosUnSecoException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		GestorDeCuenta gCuenta = new GestorDeCuenta();
		
		try {
			gCuenta.gestionar();
		} catch (SosUnSecoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		
		/*
		try {
			miCuenta.extrar(3000000);
		} catch (SosUnSecoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//e.mostrarMensaje();
			System.out.println(e.getMessage());
		}
		System.out.println("Tu cuenta tiene: " + miCuenta.getSaldo());
*/
	}
/*
		try {
			//lineas que pueden provocar excepcion
			float num = 34/0;
			System.out.println("Resultado: " + num);
			} catch (ArithmeticException e ) {
				e.printStackTrace();
			} finally{
				System.out.println("Ejecuto siempre");
		}
	}
*/
}

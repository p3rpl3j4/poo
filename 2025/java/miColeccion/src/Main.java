
public class Main {

	public static void main(String[] args) {
		Bolso<String> mi_bolso = new Bolso<String>();
		mi_bolso.guardarAlgo("Lucy");
		System.out.println(mi_bolso.obtenerAlgo());
		
		Bolso<Integer> mi_bolso_integer = new Bolso<Integer>();
		mi_bolso_integer.guardarAlgo(new Integer(10));
		System.out.println(mi_bolso_integer.obtenerAlgo());

		
			
	}

}

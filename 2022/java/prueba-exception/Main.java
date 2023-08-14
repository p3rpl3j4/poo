import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Main {

	public static void main(String[] args) {
		String nombre = "/tmp/pepe";
		
		File archivo = new File(nombre);
		FileReader fr;
		
		try {
			fr = new FileReader(archivo);
			String linea;

			BufferedReader buffer = new BufferedReader(fr);
			while ((linea = buffer.readLine()) !=null){
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println("El archivo " + nombre + " no existe.");
			//e.printStackTrace();
		} catch (IOException ioe) {
			System.out.println("Error de entrada");
		}
	}
	
}

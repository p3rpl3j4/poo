package miEmpresa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class MainLinkedList {

	//Cambiar nombre a main para probar
	public static void main(String[] args) {
		

		LinkedList<Cliente> mis_clientes = new LinkedList<Cliente>();
		
		Cliente cliA = new Cliente("Lucy", "Gutierrez", 100);
		Cliente cliB = new Cliente("Patricio", "Estrella", 140);
		Cliente cliC = new Cliente("Benjamín", "Button", 105);
		
		mis_clientes.add(cliA);
		mis_clientes.add(cliB);
		mis_clientes.add(cliC);
		mis_clientes.add(1, new Cliente("Pepe", "Trueno", 102));
		
		mis_clientes.addFirst(new Cliente("Capibara", "Torres", 130));
		
		System.out.println("Tamaño de la linkedList" + mis_clientes.size());

		System.out.println("----------------------------------------");
		System.out.println("Recorro la linkedList con for each común");
		for (Cliente cliente : mis_clientes)
			System.out.println(cliente.toString());	
		
		System.out.println("----------------------------------------");
		System.out.println("Recorro la linkedList con un Iterator");
		Iterator<Cliente> it = mis_clientes.iterator();
		while(it.hasNext()) {
			Cliente cl1 =  it.next();		
			System.out.println(cl1.toString());
		}
		
		//listIterator mejora Iterator. Tiene previous() y set()
		System.out.println("----------------------------------------");
		ListIterator<Cliente> listIt = mis_clientes.listIterator();
		while(it.hasNext()) {
			Cliente cl2 =  listIt.next();
			if (cl2.apellido.equals("Gutierrez"))
				listIt.set(new Cliente("Mauricio", "Bogliacino", 220));	
			System.out.println(cl2.toString());
		}
	}
}





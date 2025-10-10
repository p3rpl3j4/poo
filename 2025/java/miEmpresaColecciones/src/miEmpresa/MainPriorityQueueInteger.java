package miEmpresa;

import java.util.PriorityQueue;

public class MainPriorityQueueInteger {

	public static void mainPQInteger(String[] args) {
		

		PriorityQueue<Integer> fila = new PriorityQueue<Integer> ();
		
		fila.add(3);
		fila.add(14);
		fila.add(12);		
		fila.add(7);		
		fila.add(10);
		fila.add(1);
		fila.add(6);
		fila.add(-8);
		fila.add(9);
		fila.add(5);
		
		System.out.println(fila);
		
	}
}

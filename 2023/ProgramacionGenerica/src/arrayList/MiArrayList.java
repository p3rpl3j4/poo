package arrayList;

public class MiArrayList {
	
	private Object[] lista;
	private int i = 0;
	
	
	public MiArrayList (int n) {
		this.lista = new Object[n];
	}
	
	public Object get(int i) {
		return lista[i];
	}
	
	public void add(Object o) {
		lista[i] = o;
		i++;
	}	
}
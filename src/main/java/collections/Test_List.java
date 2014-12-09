package collections;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test_List {

	public static void main(String[] args) {
		
		List lista = new LinkedList();
		
		lista.add(new Integer(1));
		lista.add(new Integer(3));
		lista.add(new Integer(1)); // duplicidade
		lista.add(new Integer(2));
		
		for (int i = 0; i < lista.size(); i++) {
			Object obj = lista.get(i);
			System.out.println(obj);
		}
		
		System.out.println("Utilizando iterator");
		Iterator iterator = lista.iterator();		
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
		
	}

}

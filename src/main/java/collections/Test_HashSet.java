package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test_HashSet {

	public static void main(String[] args) {

		// Set -> SortedSet -> NavigableSet -> TreeSet
		Set hashSet = new TreeSet(new ComparadorPessoaID());
		
		hashSet.add(new Pessoa(1, "Rodrigo"));
		hashSet.add(new Pessoa(2, "Maria"));
		hashSet.add(new Pessoa(3, "João"));
		
		for (Object obj : hashSet) {
			System.out.println(obj);
		}
		
	}
	
}

class ComparadorPessoaID implements Comparator {
	// this // obj
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Pessoa && o2 instanceof Pessoa) {
			Pessoa p1 = (Pessoa) o1;
			Pessoa p2 = (Pessoa) o2;
			int id1 = p1.getId();
			int id2 = p2.getId();
			// 1 - 2 == -1
			return id1 - id2;
		}
		return -1;
	}

}


class ComparadorPessoaNome implements Comparator {
						// this   // obj
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Pessoa && o2 instanceof Pessoa) {
			Pessoa p1 = (Pessoa) o1;
			Pessoa p2 = (Pessoa) o2;
			String nomePessoa1 = p1.getNome();
			String nomePessoa2 = p2.getNome();
			return nomePessoa1.compareTo(nomePessoa2);
		}
		return -1;
	}
	
}

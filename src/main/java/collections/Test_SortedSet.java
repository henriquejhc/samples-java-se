package collections;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

class Produto {
	
	int id;
	String nome;
	int qtd;
	
	public Produto(int id, String nome, int qtd) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtd = qtd;
	}
	
}

class ComparadorProdutoByQtd implements Comparator {
	
	public int compare(Object o1, Object o2) {
		Produto pThis = (Produto) o1;
		Produto p = (Produto) o2;
		
		if (p.qtd == pThis.qtd) {
			return 0;
		} else if (p.qtd > pThis.qtd) {
			return -1;
		} else {
			return +1;
		}
	}
	
}

class ComparacaoProdutoByNome implements Comparator {
	
	public int compare(Object o1, Object o2) {
		Produto pThis = (Produto) o1;
		Produto p = (Produto) o2;
		
		if (p.nome.equals(pThis.nome)) {
			return 0;
		} else {
			return pThis.nome.compareTo(p.nome);
		}
	}
	
}


public class Test_SortedSet {

	
	public static void main(String[] args) {
		
		//ComparadorProdutoByQtd comparacao = new ComparadorProdutoByQtd();
		ComparacaoProdutoByNome comparacao = new ComparacaoProdutoByNome();
		
		SortedSet ordenacao = new TreeSet(comparacao);
		
		Produto p1 = new Produto(1, "TV", 2);
		Produto p2 = new Produto(2, "Apostila", 3);
		Produto p3 = new Produto(3, "CD", 1);
		Produto p4 = new Produto(4, "Carro", 0);
		ordenacao.add(p1);
		ordenacao.add(p2);
		ordenacao.add(p3);
		ordenacao.add(p4);
		
		for (Object obj : ordenacao) {
			Produto py = (Produto) obj;
			System.out.println(py.nome + " - " + py.qtd);
		}
		
	}
	
}

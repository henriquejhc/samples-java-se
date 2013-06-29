import java.util.ArrayList;
import java.util.Collection;


public class Test_Collection {

	public static void main(String[] args) {
		
		
		Collection colecao = new ArrayList();
		
		Integer x1 = new Integer(1);
		Integer x2 = new Integer(2);
		Integer x3 = new Integer(3);
		
		boolean b1 = colecao.add(x1);
		colecao.add(x2);
		colecao.add(x3); // automatico
		
		boolean b2 = colecao.remove(x1);
		
		if (!colecao.contains(x2)) {
			colecao.add(x2);
		}
		
		int tamanho = colecao.size();
		
		for (int i = 0; i < colecao.size(); i++) {
			// Todos os elementos
		}
		
		Collection colecao2 = new ArrayList();
		colecao2.addAll(colecao);
		
		if (!colecao.isEmpty()) {
			// faz alguma coisa
		}
		
		Object[] array = colecao.toArray();
		
	}
	
}

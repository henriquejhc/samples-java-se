package wrappers;

import java.util.ArrayList;


public class Test_Wrappers {
	
	public static void main(String[] args) {
		
		String representacaoBinaria = Integer.toBinaryString(255);
		System.out.println(representacaoBinaria);
		
		int valorInt = Integer.parseInt("12");

		Integer objInt1 = null;
		Integer objInt2 = Integer.valueOf("12");

		if (objInt1 <= objInt2) {
			System.out.println("Dentro do IF");
		}
				
		System.out.println("isDigit = " + Character.isDigit('a'));
		
		Boolean b = Boolean.FALSE;
		Boolean b1 = new Boolean(!false);
		
		
		ArrayList listaDinamica = new ArrayList();
		listaDinamica.add(objInt2);
		
		
		
	}
	

}

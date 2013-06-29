package wrappers;

import static java.lang.Boolean.*;

public class Wrappers {

	
	public static void main(String[] args) {
		
		String nome = "Globalcodecodecodecodes";
					 //0123456789
		
		
		String cpf = "123.123.123-22";
		cpf = cpf.replace('.', '\u0000');
		cpf = cpf.replace("123", "321");
		
		
		char c = nome.charAt(3);
		System.out.println("charAt = " + c);
		
		int indice = nome.indexOf("code");
		int ultimoIndice = nome.lastIndexOf("code");
		
		boolean resutaldo = nome.matches("(code)+");
		
		int numeroChars = nome.length();
		boolean vazia = nome.isEmpty();
		
		int indiceCODEMaiusculo = nome.toUpperCase().indexOf("CODE");
		
		if (nome.equals("Globalcode"));
		
		if (nome.equalsIgnoreCase("GlObAlCoDe"));
		
		
	}
	
	
	
}

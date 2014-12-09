package string;


public class Strings {
	
	public static void main(String[] args) {
		
		String s1 = "xyz";
		
		String s2 = "abc";
		
		s1 = s1.concat(s2);
		
		s1 = s1 + s2;
		
		String texto = "Este texto e um exemplo de texto de Strings";
		
		int indice = texto.indexOf("texto");
		int ultimoIndice = texto.lastIndexOf("texto");
		int indiceChar = texto.indexOf('a');
		
		
		String texto2 = "teste";
		texto2 = texto2.replace('e', 'a'); // tasta
		
		boolean b1 = texto.startsWith("Este");
		boolean b2 = texto.endsWith("ngs");
		
		String espacos = "   abcd   ";
		espacos = espacos.trim();
		
		texto = texto.toUpperCase();
		texto = texto.toLowerCase();
		
		if (texto2.equalsIgnoreCase("teste")) {}
		
		// Errada !!!
		if (texto2 == "teste") {}
		
		
		
	}

}

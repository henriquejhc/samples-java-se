
public class Test_String {

	public static void main(String... args) {
		
		String str = "Este Ž uma string";
		char c = str.charAt(1);
		
		str = str.concat(" para ser demonstrada");
		
		boolean ok = str.equals("Esta Ž uma string diferente");
		
		// OK
		if (str.equals("Valor string")) {}
		
		// N‹o OK
		if (str == "Valor string") {}
		
		// Este Ž uma string
		int index = str.indexOf("uma");
		// Este Ž uma string de uma nova string
		int lastIndex = str.lastIndexOf("uma");
		
		int tamanho = str.length();
		
		str = str.replace('.', '\u0000');
		
		// LIKE 'Esta%'
		boolean ok1 = str.startsWith("Esta");
		// LIKE '%string'
		boolean ok2 = str.endsWith("string");
		
		str = str.substring(2, 5);
		
		str = str.toLowerCase();
		
		str = str.toUpperCase();
		
		str = str.trim();
		
		if (str.contains("Esta")) {}
		
		// Rodrigo,Joao,Rafael,Maria
		String[] valoresSeparados = str.split(",");
	}
	
}

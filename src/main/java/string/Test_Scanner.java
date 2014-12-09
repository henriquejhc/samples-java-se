package string;

import java.io.File;
import java.util.Scanner;


public class Test_Scanner {

	public static void main(String[] args) throws Exception {
		
		File arquivo = new File("arquivo.csv");
		//String conteudo = "Joao,30,Florianopolis";
		
		Scanner scanner = new Scanner(arquivo);
		scanner.useDelimiter(",");
		
		while (scanner.hasNext()) {
			String substring = scanner.next();
			System.out.println(substring);
		}
		
		scanner.close();
		
		
	}
	
}

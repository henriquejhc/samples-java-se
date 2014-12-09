package string;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Locale;


public class Test_PrintF {

	public static void main(String... args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		double x = 33125.76932; // #####,00
		double y = 235.9898;
		
		System.out.printf("%04.4f qualquer coisa outra escrita %05.5f", x, y);
		
		int inteiro = 3500;
		System.out.printf("%1$,+010d", inteiro);
		System.out.printf("%1$b", true);
		
		Date dataAtual = new Date();
		System.out.printf("%1$tH : %1$tM : %1$tS", dataAtual);

	}

}

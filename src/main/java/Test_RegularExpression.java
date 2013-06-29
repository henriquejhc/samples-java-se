import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test_RegularExpression {

	private static String texto = "O 2o colocado chegou as 11h26mm33s";
	
	public static void main(String[] args) {
		
//		Pattern padrao = Pattern.compile("(\\d\\d\\w)+");
		
		// Resultados avaliação da Regex sobre o texto
//		Matcher matches = padrao.matcher(texto);
//		// Navegação nos resultados
//		while (matches.find()) {
//			System.out.println("Encontrei o valor '" + matches.group() + "' na posicao " + matches.start());
//		}
		
		String comandoRegex = "[A-Za-z0-9._-]+@([A-Za-z]+\\.)+[A-Za-z]+";
		String valorVerificado = "rodrigo@email.com";
		
		if (Pattern.matches(comandoRegex, valorVerificado)) {
			// realiza alguma coisa
		}
		

	}
	
}

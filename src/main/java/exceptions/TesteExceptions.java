package exceptions;



import java.io.IOException;
import java.sql.SQLException;


public class TesteExceptions {
	
	
	public static void main(String[] args) {
		
		try {
			int resultado = 10 / 0;
		} finally {
			System.out.println("Imprimindo algo obrigatorio");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void gerarExceptionRuntime() {
		if (1 == 1) {
			// Cria��o / Gera��o do erro
			RuntimeException exception = new RuntimeException("Erro de alguma coisa");
			// Lan�amento do erro
			throw exception;
		}		
	}
	
	
	public static void method2() throws IOException {
		gerarException();
	}
	
	// Sinaliza��o do erro
	public static void gerarException() throws IOException {
		
		if (1 == 1) {
			// Cria��o / Gera��o do erro
			IOException exception = new IOException("Erro de alguma coisa");
			// Lan�amento do erro
			throw exception;
		}
	}
	
	

}

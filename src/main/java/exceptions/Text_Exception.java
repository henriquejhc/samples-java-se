package exceptions;

import java.io.IOException;



public class Text_Exception {

	public static void main(String[] args){
		
		int x = -10;
		int y = 11;

		int resultado = 0;
		//resultado = calcular(x, y);
		
		try {
			processar();
		} catch (IOException e1) {
			System.out.println("Ok, sem problemas !!");
		} catch (Exception e2) {
		}
		
		System.out.println("Resultado = " + resultado);
		
	}
	
	static int calcular(int x, int y) throws IOException, Exception {
		if (x < 0) {
			//RuntimeException exception = new RuntimeException("N�o pode valor de X negativo");
			Exception exception = new Exception("N�o pode valor de X negativo");
			throw exception;
		} else if (y < 0) {
			IOException ioException = new IOException("N�o pode valor Y negativo");
			throw ioException;
		} else if (x > 100) {
			Exception exception = new Exception("N�o pode valor de X > 100");
			throw exception;
		}
		
		
		return x + y;
	}
	
	static void processar() throws Exception, IOException {
		
		calcular(10, 20);
		
	}
	
}

import java.io.File;
import java.io.IOException;


public class Exemplo {
	
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
		
		
		//int resultado = calcular(x, y);
		
		try {
			File file = new File("teste.txt");
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}
	
	
	static int calcular(int x, int y) throws Exception {
		
		if (x < 0) {
			Exception ex = new Exception("O valor deve ser positivo"); // checked
			throw ex;
		}
		
		
		return (x + y);
	}
	

}

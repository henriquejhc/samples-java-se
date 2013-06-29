import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import bean.Pessoa;

public class Test_InputStream {

	public static void main(String[] args) throws Exception {
		
		// input = leitura
		FileInputStream fis = new FileInputStream("arquivo.bin");
		BufferedInputStream buffer = new BufferedInputStream(fis, 512);
		//DataInputStream data = new DataInputStream(buffer);
		ObjectInputStream object = new ObjectInputStream(buffer);
		
		Pessoa p1 = (Pessoa) object.readObject();

		object.close();
		buffer.close();
		fis.close();
		
		System.out.println(p1.getNome() + " - " + p1.getIdade() + " - " + p1.getSalario() + " - " + p1.isAtivo());
		
	}
	
}

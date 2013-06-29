import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class Test_Writer {
	
	public static void main(String[] args) throws Exception {
		
		char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		//FileWriter writer = new FileWriter("arquivo.bin");
		//FileOutputStream file = new FileOutputStream("arquivo.bin");
		Socket socket = null;
		
		OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
		
		
		writer.write(caracteres);
		
		writer.flush();
		writer.close();
		//file.close();
		
		
		
	}
	

}

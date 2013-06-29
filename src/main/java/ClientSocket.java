import java.net.*;
import java.io.*;

public class ClientSocket {

	public static void main(String args[]) throws Exception {
	
		BufferedReader leitorLinhas;
		InputStreamReader leitorCaracteres;
		InputStream leitorSocket;
		
		Socket s = new Socket("localhost", 8084);
		
		leitorSocket = s.getInputStream();
		
		leitorCaracteres = new InputStreamReader(leitorSocket);
		
		leitorLinhas = new BufferedReader(leitorCaracteres);
		System.out.println(leitorLinhas.readLine());
		s.close();
	
	}

}
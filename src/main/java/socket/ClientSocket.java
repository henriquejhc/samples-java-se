package socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

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
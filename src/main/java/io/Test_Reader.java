package io;

import java.io.InputStreamReader;
import java.net.Socket;


public class Test_Reader {

	public static void main(String[] args) throws Exception {
		
		char[] caracteres = new char[7];
		
		
		
		//FileReader reader = new FileReader("arquivo.bin");
		//FileInputStream file = new FileInputStream("arquivo.bin");
		
		Socket socket = null;
		
		InputStreamReader reader = new InputStreamReader(socket.getInputStream());
		
		reader.read(caracteres);
		
		reader.close();
		
		
		for (char c : caracteres) {
			System.out.println(c);
		}
		
	}
	
}

package socket;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String args[]) throws Exception {
	
		OutputStreamWriter output;
		BufferedWriter writer;
		
		ServerSocket server = new ServerSocket(8084);
		
		while (true) {
			Socket s = server.accept();
			
			System.out.println("Cliente conectado = " + s.getInetAddress());
			
			output = new OutputStreamWriter(s.getOutputStream());
			writer = new BufferedWriter(output);
			writer.write("Welcome to Java World via Network!!!");
			writer.flush();
			writer.close();
		}
	
	}

}
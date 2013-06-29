package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test_WriteObject {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("cliente.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Cliente cliente = new Cliente("Rodrigo Silva", "123123123-12", 10, true);
		cliente.setEndereco(new Endereco("Rua Lauro Linhares", 385, "Trindade"));
		
		oos.writeObject(cliente);
		
		oos.flush();
		
		oos.close();
		fos.close();
	}
	
}

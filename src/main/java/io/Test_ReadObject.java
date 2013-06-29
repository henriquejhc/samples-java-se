package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test_ReadObject {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis = new FileInputStream("cliente.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 1. Carregar o objeto do arquivo
		// 2. Instanciar um novo objeto da classe Cliente
		// 3. Preencher este novo objeto com os dados do arquivo
		Cliente cliente = (Cliente) ois.readObject();
		
		System.out.println(cliente);
		
		ois.close();
		fis.close();
		
		
		
	}
	
	
}


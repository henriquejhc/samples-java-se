package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import bean.Pessoa;


public class Test_OutputStream {

	public static void main(String[] args) throws Exception {
		
		Pessoa p1 = new Pessoa("Rodrigo", 30, 500.0, true);
		
		// output = escrita		
		FileOutputStream file = new FileOutputStream("arquivo.bin");
		BufferedOutputStream buffer = new BufferedOutputStream(file, 512);
		//DataOutputStream data = new DataOutputStream(buffer);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		object.writeObject(p1);
		
		object.flush();
		
		object.close();
		buffer.close();
		file.close();
	}
	
}

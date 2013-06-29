package io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test_EscritaStreamBinarios {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("arquivo.bin");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos); 
		
		String nome = "Rodrigo Silva";
//		byte marcador = 0;
		Integer idade = new Integer(31);
		
		// Sequencia de escrita
//		fos.write(nome.getBytes());
//		fos.write(marcador);
//		fos.write(idade.byteValue());

		dos.writeUTF(nome);
		dos.writeInt(idade);
		
		// Canal de descarga
//		dos.flush();
//		fos.flush();
		
		dos.close();
		fos.close();
		
		System.out.println("Arquivo salvo com sucesso !!!");
		
	}
	
}
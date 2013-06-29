package io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test_LeituraStreamBinarios {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("arquivo.bin");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		System.out.println("Available = " + fis.available());

		String nome = dis.readUTF();
		Integer idade = dis.readInt();
		
		System.out.println("Nome = " + nome);
		System.out.println("Idade = " + idade);
		
//		byte[] buffer = new byte[fis.available()];
		
//		byte current = (byte) fis.read();
//		int count = 0;
//		while (current != -1) {
//			buffer[count++] = current;
//			current = (byte) fis.read();
//		}
//		
		dis.close();
		fis.close();
//		
//		System.out.println("Bytes do arquivo");
//		for (byte b : buffer) {
//			System.out.print(b);
//		}
	}
	
}

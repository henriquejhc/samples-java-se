package io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test_EscritaStreamCharacter {

	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("arquivo.csv");
		BufferedWriter bw = new BufferedWriter(fw);
		
		Cliente cliente = new Cliente("Rodrigo Silva", "123123123-12", 10, true);
		
		bw.write(cliente.getNome() + "," + cliente.getCpf() + "," + cliente.getCodigo() + "," + cliente.getAtivo());
		bw.newLine();
		
		bw.close();
		fw.close();
		
		
	}
	
}

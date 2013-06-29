package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test_LeituraStreamCharacter {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("arquivo.csv");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		String[] values = line.split(",");
		
		Cliente cliente = new Cliente(values[0], values[1], new Integer(values[2]), Boolean.parseBoolean(values[3]));
		
		System.out.println(cliente);
		
		br.close();
		fr.close();
		
	}
	
}

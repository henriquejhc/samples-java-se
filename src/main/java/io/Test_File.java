package io;

import java.io.File;
import java.io.FilenameFilter;

public class Test_File {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/rodrigo/Downloads");
		
		System.out.println("Leitura = " + file.canRead());
		System.out.println("Escrita = " + file.canWrite());
		System.out.println("Path = " + file.getPath());
		System.out.println("Cannonical Path = " + file.getCanonicalPath());
		System.out.println("Total Space = " + file.getTotalSpace());
		
		if (file.isDirectory()) {
			System.out.println("Listando os arquivos do diretorio:");
			String[] files = file.list(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.endsWith(".pdf");				
				}
			});
			for (String name : files) {
				System.out.println(name);
			}
		}
		
	}
	
//	static class SomentePDF implements FilenameFilter {
//
//		public boolean accept(File dir, String name) {
//			return name.endsWith(".pdf");
//		}
//		
//	}
	
}

package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {
	
	public static void main(String[] args) throws IOException {
		
//		OutputStream os = new FileOutputStream("teste.txt");
//		
//		Writer w = new OutputStreamWriter(os);
//		
//		BufferedWriter bw = new BufferedWriter(w);
		
		FileWriter fw = new FileWriter("fileWriter.txt");
		
		fw.write("teeeeeste");
		fw.write("\n");
		fw.write("asdsadsa");
		fw.close();
		
	}
}

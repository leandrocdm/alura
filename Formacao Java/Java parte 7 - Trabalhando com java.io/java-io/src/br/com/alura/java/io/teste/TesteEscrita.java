package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("teste.txt");
		
		Writer w = new OutputStreamWriter(os);
		
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("oie");
		bw.newLine();
		bw.write("aijsdiasjdijasidsa");
		
		bw.close();
	}
}

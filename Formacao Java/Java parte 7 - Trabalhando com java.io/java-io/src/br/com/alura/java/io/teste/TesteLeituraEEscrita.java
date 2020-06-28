package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeituraEEscrita {
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = System.in;//new FileInputStream("lorem.txt");
		
		Reader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = System.out;//new FileOutputStream("loremNovo.txt");
		
		Writer w = new OutputStreamWriter(os);
		
		BufferedWriter bw = new BufferedWriter(w);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		System.out.println("copiado com sucesso!");
		br.close();
		bw.close();
	}
}
package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita3 {
	
	public static void main(String[] args) throws IOException {
		
		//FileWriter fw = new FileWriter("file.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
		bw.write("auhsdhasuhudhas");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("asdadsa");
		
		bw.close();
		
	}

}

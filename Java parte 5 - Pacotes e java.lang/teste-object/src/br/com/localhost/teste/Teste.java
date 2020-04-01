package br.com.localhost.teste;

public class Teste {

	public static void main(String[] args) {
		
		Object o = new Object();
		
		System.out.println(retornaHash(o));	
	}
	
	static String retornaHash(Object o) {
		int i = o.toString().indexOf('@');
		String s = o.toString().substring(i+1);
		return s;
	}
}

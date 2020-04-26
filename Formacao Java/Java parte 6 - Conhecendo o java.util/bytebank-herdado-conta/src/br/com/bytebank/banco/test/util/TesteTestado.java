  package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteTestado {
	
	public static void main(String[] args) {
		
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);
		
		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		Conta cc5 = new ContaPoupanca(22, 22);
		Cliente clienteCC5 = new Cliente();
		clienteCC5.setNome("Ana");
		cc5.setTitular(clienteCC5);
		cc5.deposita(222.0);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		for (Conta c : lista) {
			System.out.println(c);
		}
		
		System.out.println("----------------");
		
		System.out.println(lista.contains(cc5));
		
		System.out.println("----------------");
		
		LinkedList<Conta> linkedList = new LinkedList<Conta>();
		
		lista.sort((Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		lista.forEach(c -> System.out.println(c));
		
		//lista.sort(new SaldoComparator());
		//lista.sort(new TitularComparator());
		
//		Collections.sort(lista, new Comparator<Conta>(){
//
//			@Override
//			public int compare(Conta o1, Conta o2) {
//				
//				String nome1 = o1.getTitular().getNome();
//				String nome2 = o2.getTitular().getNome();
//				
//				return nome1.compareTo(nome2);
//			}
//			
//		}
//);
//		
//		lista.sort(new Comparator<Conta>(){
//	
//
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		return Integer.compare(c1.getNumero(), c2.getNumero());
//	}
//	
//	
//});
//		
//		for (Conta conta : lista) {
//			System.out.println(conta);
//		}
//		
//		linkedList.sort(c);
		
		
	}

}


class TitularComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		
		String nome1 = o1.getTitular().getNome();
		String nome2 = o2.getTitular().getNome();
		
		return nome1.compareTo(nome2);
	}
	
}


class SaldoComparator implements Comparator<Conta>{
	

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
	
	
}

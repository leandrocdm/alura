package br.com.bytebank.banco.test;

import br.com.bytebank.banco.exception.SaldoInsuficienteException;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}

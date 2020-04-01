package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.CalculadorDeImposto;
import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		System.out.println(cc.getSaldo());
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		Cliente c = new Cliente();
		
		
		calc.registra(c);
		
		System.out.println(calc.getTotalImposto());

	}

}

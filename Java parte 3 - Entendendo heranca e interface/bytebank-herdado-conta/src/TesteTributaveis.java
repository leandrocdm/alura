
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		ContaPoupanca cp = new ContaPoupanca(1231, 123);
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		//calc.registra(cp);
		
		System.out.println(calc.getTotalImposto());

	}

}

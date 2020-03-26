
public class TesteContas {

	public static void main(String[] args) {
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		System.out.println(cc.getSaldo());
		
		try {
			cc.saca(130.0);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(cc.getSaldo());

	}

}

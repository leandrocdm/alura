
public class TesteReferencia {

	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 30;
		
		Conta conta2 = new Conta();
		
		conta2 = conta1;
		
		Conta conta3 = new Conta();
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		
		System.out.println(conta1 == conta2);
		
		System.out.println(conta2.saldo);
	}
}

public class TesteMetodosConta {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.depositar(1000);
		
		System.out.println(conta1.saldo);
		
		conta1.transferir(200, conta2);
		
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
		System.out.println(conta2.sacar(300));
		
		System.out.println(conta2.saldo);
	}

}

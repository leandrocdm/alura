
public class TesteCriaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.agencia = 102;
		conta1.numero = 2;
		conta1.saldo = 203;
		//conta1.titular = "Leandro";
		
		System.out.println("Saldo conta1 - " +conta1.saldo);
		
		Conta conta2 = new Conta();
		
		conta2.saldo = 2023;
		
		System.out.println(conta2.codigo);
			
	}
}

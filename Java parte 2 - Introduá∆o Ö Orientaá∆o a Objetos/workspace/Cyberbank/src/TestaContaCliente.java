public class TestaContaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Leandro";
		
		Conta conta = new Conta();
		
		conta.depositar(100);
		conta.titular = cliente;
		
		System.out.println(conta.titular.nome);
	}
}

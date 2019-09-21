public class TestaContaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Conta conta = new Conta();
		
		cliente.setNome("Leandro");
		cliente.setCpf("1231231211");
		cliente.setProfissao("Engenheiro");
		
		conta.depositar(100);
		
		conta.setTitular(cliente);
		
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
		
	}
}
 
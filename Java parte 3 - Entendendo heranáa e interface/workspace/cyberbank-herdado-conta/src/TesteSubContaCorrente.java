
public class TesteSubContaCorrente {
	
	public static void main(String[] args) {
		
		SubContaCorrente scc = new SubContaCorrente(112, 123);
		scc.depositar(1000);
		scc.sacar(100);
		
		System.out.println(scc.getSaldo());
		
	}

}

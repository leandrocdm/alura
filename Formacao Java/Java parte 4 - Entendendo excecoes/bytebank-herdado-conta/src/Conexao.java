
public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo conexao...");
		throw new IllegalStateException();
		
	}
	
	public void lerDados() {
		System.out.println("Lendo dados...");
		throw new IllegalStateException();
	}

	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexao...");
		
	}
	


}

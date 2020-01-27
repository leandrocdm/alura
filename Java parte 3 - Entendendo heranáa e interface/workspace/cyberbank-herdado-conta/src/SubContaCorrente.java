
public class SubContaCorrente extends ContaCorrente{
	
	public SubContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public boolean sacar(double valor) {
		double saqueTaxa = valor;
		return super.sacar(saqueTaxa);
	}

}

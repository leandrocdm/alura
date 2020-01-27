
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double sacaComTaxa = valor + 12;
		return super.sacar(sacaComTaxa);
	}
	
}

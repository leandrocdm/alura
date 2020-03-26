
public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException() {
		super("Saldo insulficiente!");
	}
	
	public SaldoInsuficienteException(double saldo, double valor) {
		super("Saldo insulficiente: saldo atual: "+saldo+ " valor do saque: "+ valor);
	}

}

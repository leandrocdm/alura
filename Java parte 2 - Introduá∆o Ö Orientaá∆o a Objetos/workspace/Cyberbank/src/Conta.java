public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	char codigo;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(this.saldo < valor) {
			return false;
		}else {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
	}
}

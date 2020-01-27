public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private char codigo;
	private static int total = 0;
			
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public char getCodigo() {
		return codigo;
	}
	
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}

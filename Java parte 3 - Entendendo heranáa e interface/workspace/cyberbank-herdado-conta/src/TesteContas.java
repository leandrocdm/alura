
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1001, 12325);
		
		ContaPoupanca cp = new ContaPoupanca(2323, 123121);
		
		cc.depositar(1000);
		
		cp.depositar(500);
		
		
		System.out.println("cc: "+cc.getSaldo());
		System.out.println("cp: "+cp.getSaldo());
		
		System.out.println("----------------");
		
		cc.sacar(100);
		
		System.out.println("cc: "+cc.getSaldo());
		
		
	}
	
}

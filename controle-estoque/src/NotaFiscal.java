public class NotaFiscal implements GerarNotaFiscal {
	
	private static int id = 1;
	private String cpfOuCnpj;
	private Pedido pedido;
	
	public NotaFiscal() {
		id++;
	}
	public int getId() {
		return id;
	}
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public void enviarCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
		
	}
}

import java.util.List;

public class PedidoCliente extends Pedido implements GerarNotaFiscal{
	
	private Cliente cliente;
	private List<Produto> produtos;
	private NotaFiscal notaFiscal;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	@Override
	public void enviarCpfOuCnpj() {
		this.notaFiscal.setCpfOuCnpj(this.cliente.getCpf());
		
	}
}

import java.util.Date;
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
	public void enviarCpfOuCnpj(String cpf) {
		this.notaFiscal.setCpfOuCnpj(this.cliente.getCpf());
		
	}
	@Override
	public Date getDtPedido() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDtPedido(Date dtPedido) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setNumero(int numero) {
		// TODO Auto-generated method stub
		
	}
}

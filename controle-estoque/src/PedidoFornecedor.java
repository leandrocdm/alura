import java.util.List;

public class PedidoFornecedor extends Pedido implements GerarNotaFiscal{
	
	private Fornecedor fornecedor;
	private List<Produto> produtos;
	private NotaFiscal notaFiscal;
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
		this.notaFiscal.setCpfOuCnpj(this.fornecedor.getCnpj());	
	}
}
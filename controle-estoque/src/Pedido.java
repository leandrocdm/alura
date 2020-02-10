import java.util.Date;
import java.util.List;

public abstract class Pedido {

	private int numero;
	private List<Produto> produtos;
	private Date dtPedido;
	@SuppressWarnings("unused")
	private ControleEstoque controle;
	 
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Date getDtPedido() {
		return dtPedido;
	}
	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}

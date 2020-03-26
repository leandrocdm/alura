import java.util.Date;
import java.util.List;

public abstract class Pedido {

	int numero;
	List<Produto> produtos;
	Date dtPedido;
	ControleEstoque controle;

	abstract List<Produto> getProdutos();
	abstract void setProdutos(List<Produto> produtos);
	abstract Date getDtPedido();
	abstract void setDtPedido(Date dtPedido);
	abstract int getNumero();
	abstract void setNumero(int numero);
}

import java.util.List;

public class BancoDeDados {

	List<Produto> produtos;
	List<Cliente> clientes;
	List<Estoque> estoques;
	List<Fornecedor> fornecedores;
	List<NotaFiscal> notas;
	List<PedidoFornecedor> pedidosFornecedores;
	List<PedidoCliente> pedidosClientes;
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Estoque> getEstoques() {
		return estoques;
	}
	public void setEstoques(List<Estoque> estoques) {
		this.estoques = estoques;
	}
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	public List<NotaFiscal> getNotas() {
		return notas;
	}
	public void setNotas(List<NotaFiscal> notas) {
		this.notas = notas;
	}
	public List<PedidoFornecedor> getPedidosFornecedores() {
		return pedidosFornecedores;
	}
	public void setPedidosFornecedores(List<PedidoFornecedor> pedidosFornecedores) {
		this.pedidosFornecedores = pedidosFornecedores;
	}
	public List<PedidoCliente> getPedidosClientes() {
		return pedidosClientes;
	}
	public void setPedidosClientes(List<PedidoCliente> pedidosClientes) {
		this.pedidosClientes = pedidosClientes;
	}
}

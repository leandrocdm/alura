public class ControleEstoque {

	private Estoque estoque;
	
	public ControleEstoque() {}
	public ControleEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	void adicionarProduto(Produto produto, int quantidade) {
		this.estoque.setQuantidade(this.estoque.getQuantidade() + quantidade);

	}
	void removerProduto(Produto produto, int quantidade) {
		this.estoque.setQuantidade(this.estoque.getQuantidade() - quantidade);
	}
}

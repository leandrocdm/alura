
public class TesteBanco {
	
	public static void main(String[] args) {
		
		BancoDeDados bd = new BancoDeDados();
		
		Produto prod = new Produto();
		prod.setNome("teste");
		
		bd.produtos.add(prod);
		
		bd.produtos.forEach(p-> System.out.println(p.getNome()));
	}

}

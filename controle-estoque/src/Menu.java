import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	
	public void menuPrincipal() {
		System.out.println("***************************************");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Cadastrar Fornecedor");
		System.out.println("4 - Cadastrar Pedido Fornecedor");
		System.out.println("5 - Cadastrar Pedido Cliente");
		System.out.println("***************************************");
	}
		
	public void menuOpcoes(int opcao) {
		switch (opcao) {
		case 1:
			Produto produto = new Produto();
			System.out.println("Qual nome do produto");
			produto.setNome(scan.next());
			System.out.println("Qual preco do "+produto.getNome());
			produto.setPreco(scan.nextInt());
			System.out.println("Qual desconto do "+produto.getNome());
			produto.setDesconto(scan.nextInt());
		case 2:
			Cliente cliente = new Cliente();
			
			break;

		default:
			break;
		}
	}

}

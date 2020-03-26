import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);

	BancoDeDados bd = new BancoDeDados();

	Produto produto = new Produto();
	Cliente cliente = new Cliente();
	Fornecedor fornecedor = new Fornecedor();
	PedidoFornecedor pf = new PedidoFornecedor();
	PedidoCliente pc = new PedidoCliente();
	
	
	public int menuPrincipal() {
		System.out.println("***************************************");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Cadastrar Fornecedor");
		System.out.println("4 - Cadastrar Pedido Fornecedor");
		System.out.println("5 - Cadastrar Pedido Cliente");
		System.out.println("***************************************");
		return scan.nextInt();
	}

	public void menuOpcoes(int opcao) {
		switch (opcao) {
		case 1:
		
			System.out.println("Qual nome do produto");
			produto.setNome(scan.next());
			System.out.println("Qual preco do "+produto.getNome());
			produto.setPreco(scan.nextInt());
			System.out.println("Qual desconto do "+produto.getNome());
			produto.setDesconto(scan.nextInt());
			System.out.println("Produto criado! "+produto.getNome());
			System.out.println(produto.getId());

			menuOpcoes(menuPrincipal());
		case 2:

			System.out.println("Digite o nome do cliente");
			cliente.setNome(scan.next());
			System.out.println("Digite o cpf do "+cliente.getNome());
			cliente.setCpf(scan.next());
			System.err.println("Cliente criado! "+cliente.getId() + " "+cliente.getNome());	
			
			bd.clientes.add(cliente);

			menuOpcoes(menuPrincipal());
		case 3:
			
			System.out.println("Digite o nome do Fornecedor");
			fornecedor.setNome(scan.next());
			System.out.println("Digite o cpf do "+fornecedor.getNome());
			fornecedor.setCnpj(scan.next());
			System.err.println("Fornecedor criado! "+fornecedor.getId() + " "+fornecedor.getNome());		

			menuOpcoes(menuPrincipal());
		case 4:
			
			System.out.println("Digite o id do fornecedor");
			System.out.println("***************************************");
			for (PedidoFornecedor pf : bd.pedidosFornecedores) {
				System.out.println(pf.getFornecedor().getNome());
			}
			System.out.println("***************************************");
			
		case 5:
			
			break;
		default:
			break;
		}
	}

}

import java.util.List;
import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);
	BancoDeDados bd;
	Produto produto;
	

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

	@SuppressWarnings("null")
	public void menuOpcoes(int opcao) {
			switch (opcao) {
			case 1:
				produto = new Produto();
				bd = new BancoDeDados();
				List<Produto> lista = null;
				System.out.println("Qual nome do produto");
				produto.setNome(scan.next());
				System.out.println("Qual preco do "+produto.getNome());
				produto.setPreco(scan.nextInt());
				System.out.println("Qual desconto do "+produto.getNome());
				produto.setDesconto(scan.nextInt());
				System.out.println("Produto criado! "+produto.getNome());
				System.out.println(produto.getId());
				lista.add(produto);
				bd.produtos = lista;
				menuOpcoes(menuPrincipal());
			case 2:
				Cliente cliente = new Cliente();
				System.out.println("Digite o nome do cliente");
				cliente.setNome(scan.next());
				System.out.println("Digite o cpf do "+cliente.getNome());
				cliente.setCpf(scan.next());
				System.err.println("Cliente criado! "+cliente.getId() + " "+cliente.getNome());			 
				bd.clientes.add(cliente);
				
				menuOpcoes(menuPrincipal());
			case 3:
				Fornecedor fornecedor = new Fornecedor();
				System.out.println("Digite o nome do Fornecedor");
				fornecedor.setNome(scan.next());
				System.out.println("Digite o cpf do "+fornecedor.getNome());
				fornecedor.setCnpj(scan.next());
				System.err.println("Fornecedor criado! "+fornecedor.getId() + " "+fornecedor.getNome());			 
				bd.fornecedores.add(fornecedor);
				
				menuOpcoes(menuPrincipal());
			case 4:
				PedidoFornecedor pf = new PedidoFornecedor();
				System.out.println("Digite o id do fornecedor");
			case 5:
				bd = new BancoDeDados();
				bd.getProdutos();
				break;
			default:
				break;
			}
		}

	}

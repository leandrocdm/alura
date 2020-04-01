import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("digite a qtd de produtos");
//		int qtdProd = scan.nextInt();
//
//		ArrayList<Produto> listaProdutos = new ArrayList<>();
//		int q = 1;
		
//		
//		Object ob = new Object();
//		
//		System.out.println(ob);
		
		Produto p = new Produto();
		
		System.out.println(p);

//		for (int i = 0; i < qtdProd; i++) {
//			Produto prod = new Produto();
//			
//			
//			System.out.println("digite o nome do "+q+" produto");
//			prod.setNome(scan.next());
//			
//			System.out.println("digite a qtd "+ prod.getNome());
//			prod.setQtd(scan.nextInt());
//			
//			System.out.println("digite o preco do "+ prod.getNome());
//			prod.setPreco(scan.nextInt());
//			
//			System.out.println("digite o desconto do "+ prod.getNome());
//			prod.setDesconto(scan.nextInt());
//			
//			listaProdutos.add(prod);
//			q++;
//			
//			
//			if(i+1 == qtdProd) {
//				System.out.println("*******************************");
//			}else {
//				System.err.println("Adicionando outro produto....");
//			}
//		}
//		
//		double valorTotal = 0, valorTotalDescontos = 0;
//		
//		for (Produto produto : listaProdutos) {
//			valorTotal += produto.getPreco() * produto.getQtd();
//			valorTotalDescontos += produto.getDesconto();
//			System.out.println(
//					" Produto: "+produto.getNome() + 
//					" Valor uni: "+ produto.getPreco() +
//					" Desconto: "+ produto.getDesconto()+
//					" Total do produto: "+ produto.valorTotalProduto(produto.getQtd(), produto.getPreco(), produto.getDesconto()));
//		}
//		
//		System.out.println("*******************************");
//		System.out.println("Qtd de produtos => "+ qtdProd);
//		System.out.println("Total valor => "+valorTotal);
//		System.out.println("Valor total de descontos => "+ valorTotalDescontos);
//		System.out.println("Valor total do pedido => "+ (valorTotal - valorTotalDescontos));
//		System.out.println("*******************************");
//
	}
}

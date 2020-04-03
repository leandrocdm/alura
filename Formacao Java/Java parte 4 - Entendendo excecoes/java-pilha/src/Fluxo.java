
public class Fluxo {

	public static void main(String[] args){
		System.out.println("Ini do main");
		int a = 2;
		try {
			metodo1(a);
		} catch (MinhaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1(int a) throws MinhaException{
		System.out.println("Ini do metodo1");
		metodo2(a);
		System.out.println("Fim do metodo1");
	}

	private static void metodo2(int a) throws MinhaException{
		System.out.println("Ini do metodo2");
		Teste t = new Teste();
		t.valida(1, 2);
	}
}
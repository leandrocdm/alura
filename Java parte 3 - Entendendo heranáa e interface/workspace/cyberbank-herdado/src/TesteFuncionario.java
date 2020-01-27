public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario teste = new Funcionario();
		
		teste.setNome("Teuajsda");
		teste.setCpf("12312312312");
		teste.setSalario(1000);
		
		System.out.println(teste.getBonificacao());
	}
}

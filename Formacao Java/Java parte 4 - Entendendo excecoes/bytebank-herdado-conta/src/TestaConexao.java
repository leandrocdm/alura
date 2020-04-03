
public class TestaConexao {
	
	public static void main(String[] args) {
		
		try(Conexao c = new Conexao()){
			c.lerDados();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		Conexao c = null;
//		
//		try {
//			
//			c = new Conexao();
//			c.lerDados();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			c.fecha();
//		}

	}

}

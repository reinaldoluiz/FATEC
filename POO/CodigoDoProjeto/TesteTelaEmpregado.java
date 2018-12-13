import java.sql.Connection;

public class TesteTelaEmpregado {
	
	public static void main (String args[]) {
		try {
			Connection conn = new ConexaoBD().conectar();
			new TelaEmpregado(conn);
		}
		catch (Exception e) {
			System.out.println("oh - oh");
		}
	}
}
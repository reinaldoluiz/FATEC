import java.sql.SQLException;
import java.sql.Connection;
public class MainEmpregado {

	public static void main(String[] args) {
		Connection conn = null;
		Empregado emp;
		Consulta consulta;
		try {
			conn = ConexaoBD.conectar();
			//vd = new Vendedor();
			consulta = new Consulta();
			conn.setAutoCommit(false);
			emp = new Empregado(101,"Maria Conceicao","259874569", "65987456931","04/04/2005","Auxiliar Administrativa");
			emp.incluir(conn);
			emp = new Empregado();
			emp.setIdEmpregado(102);
			emp.setNome("Carlos Marinho");
			emp.setCargo("Contador");
			emp.incluir(conn);
			emp = new Cliente(103,"Joao da Silva","235987569", "32659874561", "08/05/2014", "Tecnico em Contabilidade");
			emp.incluir(conn);
			conn.commit();
			System.out.println("\nLista todos os clientes");
			consulta.listarEmpregados(conn);
			System.out.println("\nCarregando e excluindo o 103");
			emp = new Empregado(104);
			System.out.println(emp);
			emp.carregar(conn);
			System.out.println(emp);
			emp.excluir(conn);
			conn.commit();
			System.out.println("\nLista todos os Empregados");
			consulta.listarEmpregados(conn);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}

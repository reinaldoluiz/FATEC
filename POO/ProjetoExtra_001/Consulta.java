import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Consulta {
	public void listarEmpregados(Connection conn)
	{
		ArrayList<Empregado> lista = buscarEmpregados(conn);
		for(Empregado empregado: lista)
			System.out.println(empregado);
	}
	public ArrayList<Empregado> buscarEmpregados(Connection conn)
	{
		String sqlSelect = "SELECT idEmpregado, nome, rg, cpf, dtAdmissao, cargo FROM EMPREGADO";
		ArrayList<Empregado> lista = new ArrayList<>();
		try(PreparedStatement stm =conn.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();)
		{
			while(rs.next())
			{
				Empregado empregado = new Empregado();
				empregado.setIdEmpregado(rs.getInt("idEmpregado"));
				empregado.setNome(rs.getString("nome"));
				empregado.setRg(rs.getString("rg"));
				empregado.setCpf(rs.getString("cpf"));
				empregado.setDtAdmissao(rs.getString("dtAdmissao"));
				empregado.setCargo(rs.getString("Cargo"));
				lista.add(empregado);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lista;
	}

}

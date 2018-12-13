import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Empregado {
	//atributos
	private int idEmpregado;
	private String nome;
	private String rg;
	private String cpf;
	private String dtAdmissao;
	private String cargo;
	
	public Empregado (int idEmpregado, String nome, String rg, String cpf, String dtAdmissao, String cargo) {
		this.idEmpregado = idEmpregado;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtAdmissao = dtAdmissao;
		this.cargo = cargo;
	}
	
	public Empregado() { }
	
	//metodos de acesso
	public int getIdEmpregado() {
		return idEmpregado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getDtAdmissao() {
		return dtAdmissao;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	//modificadores
	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setRg (String rg) {
		this.rg = rg;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public void setDtAdmissao (String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	
	public void setCargo (String cargo) {
		this.cargo = cargo;
	}
	


	@Override
	public String toString(){
		return "Empregado [ID Empregado=" + idEmpregado + ", nome=" + nome + "Cargo=" + cargo + "]"; 
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		if(idEmpregado != other.idEmpregado)
			return false;
		return true;
	}
	


public void incluir(Connection conn)
	{
		String sqlInsert = "INSERT INTO empregado(idEmpregado,nome,fone) VALUES (?, ?, ?)";
		try(PreparedStatement stm=conn.prepareStatement(sqlInsert))
		{
			stm.setInt(1, getIdEmpregado());
			stm.setString(2, getNome());
			stm.setString(3, getRg());
			stm.setString(4, getCpf());
			stm.setString(5, getDtAdmissao());
			stm.setString(6, getCargo());
			stm.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch(SQLException e1)
			{
				System.out.println(e1.getStackTrace());
			}
		}
	}
	public void excluir(Connection conn)
	{
		String sqlDelete = "DELETE FROM empregado WHERE idEmpregado = ?";
		try(PreparedStatement stm = conn.prepareStatement(sqlDelete);)
		{
			stm.setInt(1, getIdEmpregado());
			stm.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch(SQLException e1)
			{
				System.out.println(e1.getStackTrace());
			}
		}
	}
	public void atualizarTelefone(Connection conn, String novoFone)
	{
		String sqlUpdate = "UPDATE CLIENTE SET FONE = ? WHERE ID = ?";
		try (PreparedStatement stm = conn.prepareStatement(sqlUpdate);)
		{
			stm.setString(1, novoFone);
			stm.setInt(2,getIdEmpregado());
			stm.execute();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch (SQLException e1)
			{
				System.out.println(e1.getStackTrace());
			}
		}
	} 
	public void carregar(Connection conn)
	{
		String sqlSelect = "SELECT * FROM empregado WHERE empregado.idEmpregado = ?";
		try(PreparedStatement stm = conn.prepareStatement(sqlSelect);)
		{
			stm.setInt(1, getIdEmpregado());
			try(ResultSet rs = stm.executeQuery();)
			{
				if(rs.next())
				{
					this.setNome(rs.getString(2));
					this.setRg(rs.getString(3));
					this.setCpf(rs.getString(4));
					this.setDtAdmissao(rs.getString(5));
					this.setCargo(rs.getString(6));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(SQLException e1)
		{
			System.out.println(e1.getStackTrace());
		}
	}
	public ArrayList<Empregado> buscarEmpregados(Connection conn)
	{
		String sqlSelect = "SELECT id, nome, fone, FROM EMPREGADO";
		ArrayList<Empregado> lista = new ArrayList<>();
		try(PreparedStatement stm = conn.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();)
		{
			while(rs.next())
			{
				Empregado empregado = new Empregado();
				empregado.setIdEmpregado(rs.getInt("id"));
				empregado.setNome(rs.getString("nome"));
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


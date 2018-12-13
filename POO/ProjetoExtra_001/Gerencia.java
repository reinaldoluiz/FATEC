public class Gerencia {
	//atributos
	private Empregado numRegistro;
	private String nome;
	private String funcao;
	private String setor;
	
	//construtor
	public Gerencia (Empregado numRegistro, String nome, String funcao, String setor) {
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.funcao = funcao;
		this.setor = setor;
	}
	
	//metodos de acesso
	public Empregado getNumRegistro() {
		return numRegistro;
	}
	public String getNome() {
		return nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public String getSetor() {
		return setor;
	}
	//metodos modificadores
	public void setNumRegistro (Empregado numRegistro) {
		this.numRegistro = numRegistro;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setFuncao (String funcao) {
		this.funcao = funcao;
	}
	public void setSetor (String setor) {
		this.setor = setor;
	}

}

	
public class RH {
	//atributos
	private Empregado numRegistro;
	private String nome;
	private Pedido numPedido;
	private Validacao situacao;
	
	//construtor
	public RH (Empregado numRegistro, String nome, Pedido numPedido, Validacao situacao) {
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.numPedido = numPedido;
		this.situacao = situacao;
	}
	
	//metodos de acesso
	public Empregado getNumRegistro() {
		return numRegistro;
	}
	public String getNome() {
		return nome;
	}
	public Pedido getNumPedido() {
		return numPedido;
	}
	public Validacao getSituacao() {
		return situacao;
	}
	
	//metodos modificadores
	public void setNumRegistro(Empregado numRegistro) {
		this.numRegistro = numRegistro;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setNumPedido (Pedido numPedido) {
		this.numPedido = numPedido;
	}
	public void setSituacao (Validacao situacao) {
		this.situacao = situacao;
	}
	
}
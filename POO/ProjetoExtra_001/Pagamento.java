public class Pagamento {
	//atributos
	private String nome;
	private int conta;
	private String dtMovimentacao;
	private Pedido numPedido;
	
	//contrutor
	public Pagamento (String nome, int conta, String dtMovimentacao, Pedido numPedido) {
		this.nome = nome;
		this.conta = conta;
		this.dtMovimentacao = dtMovimentacao;
		this.pedido = pedido;
	}
	//metodos de acesso
	public String getNome() {
		return nome;
	}
	public int getConta() {
		return conta;
	}
	public String getDtMovimentacao() {
		return dtMovimentacao;
	}
	
	//metodos modificadores
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setConta (int conta) {
		this.conta = conta;
	}
	public void setDtMovimentacao (String dtMovimentacao) {
		this.dtMovimentacao = dtMovimentacao;
	}
	public void setPedido (Pedido numPedido) {
		this.numPedido = numPedido;
	}

}
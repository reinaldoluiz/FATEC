public class Validacao {
	//atributos
	private Pedido numPedido;
	private String situacao;
	
	//construtor
	public Validacao (Pedido numPedido, String situacao) {
		this.numPedido = numPedido;
		this.situacao = situacao;
	}
	
	//metodos de acesso
	public Pedido getNumPedido() {
		return numPedido;
	}
	public String getSituacao() {
		return situacao;
	}
	
	//metodos modificadores
	public void setNumPedido(Pedido numPedido) {
		this.numPedido = numPedido;
	}
	public void setSituacao (String situacao) {
		this.situacao = situacao;
	}

}
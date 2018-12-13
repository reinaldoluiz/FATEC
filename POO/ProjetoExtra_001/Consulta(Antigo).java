public class Consulta {
	//atributos
	private double numProtocolo;
	private Pedido numPedido;
	private Pedido data;
	private String status;
	
	//construtor
	public Consulta (double numProtocolo, Pedido numPedido, Pedido data, String status) {
		this.numProtocolo = numProtocolo;
		this.numPedido = numPedido;
		this.data = data;
		this.status = status;
	}
	
	//metodos de acesso
	public double getNumProtocolo() {
		return numProtocolo;
	}
	public Pedido getNumPedido() {
		return numPedido;
	}
	public Pedido getDada() {
		return data;
	}
	public String getStatus() {
		return status;
	}
	
	//metodos modificadores
	public void setNumProtocolo (double numProtocolo) {
		this.numProtocolo = numProtocolo;
	}
	public void setNumPedido (Pedido numPedido) {
		this.numPedido = numPedido;
	}
	public void setData (Pedido data) {
		this.data = data;
	}
	public void setStatus (String status) {
		this.status = status;
	}
}

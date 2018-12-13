public class Relatorio {
	//atributos
	private double numRelatorio;
	private Pedido numPedido;
	private Pedido mesReferencia;
	private Empregado numRegistro;
	
	//construtor
	public Relatorio (double numRelatorio, Pedido numPedido, Pedido mesReferencia, Empregado numRegistro) {
		this.numRelatorio = numRelatorio;
		this.numPedido = numPedido;
		this.mesReferencia = mesReferencia;
		this.numRegistro = numRegistro;
	}
	
	//metodos de acesso
	public double getNumRelatorio() {
		return numRelatorio;
	}
	
	public Pedido getNumPedido() {
		return numPedido;
	}
	
	public Pedido getMesReferencia() {
		return mesReferencia;
	}
	
	public Empregado getNumRegistro() {
		return numRegistro;
	}
	
	//metodos modificadores
	public void setNumRelatorio (double numRelatorio) {
		this.numRelatorio = numRelatorio;
	}
	
	public void setNumPedido (Pedido numPedido) {
		this.numPedido = numPedido;
	}
	
	public void setMesReferencia (Pedido mesReferencia) {
		this.mesReferencia = mesReferencia;
	}
	
	public void setNumRegistro (Empregado numRegistro) {
		this.numRegistro = numRegistro;
	}
}


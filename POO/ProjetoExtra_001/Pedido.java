public class Pedido {
	private double numPedido;
	private int mesReferencia;
	private int data;
	private double valorPago;
	private String categoria;
	private String descricao;
	
	public Pedido (double numPedido, int mesReferencia, int data, double valorPago, String categoria, String descricao) {
		this.numPedido = numPedido;
		this.mesReferencia = mesReferencia;
		this.data = data;
		this.valorPago = valorPago;
		this.categoria = categoria;
		this.descricao = descricao;
	{
	//metodos de acesso
	public double getNumPedido() {
		return numPedido;
	}
	
	public int getMesReferencia() {
		return mesReferencia;
	}
	
	public int getData() {
		return data;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	//modificadores
	public void setNumPedido (double numPedido) {
		this.numPedido = numPedido;
	}
	
	public void setMesReferencia (int mesReferencia) {
		this.mesReferencia = mesReferencia;
	}
	
	public void setData (int data) {
		this.data = data;
	}
	
	public void setValorPago (double valorPago) {
		this.valorPago = valorPago;
	}
	
	public void setCategoria (String categoria) {
		this.categoria = categoria;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
}
	
	
	
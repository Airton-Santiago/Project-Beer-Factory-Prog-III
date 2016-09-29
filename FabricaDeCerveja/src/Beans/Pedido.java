package Beans;

public class Pedido {

	private String codigoDoPedido;
	protected static double valor_pedido;

	public Pedido() {

	}

	public Pedido(String codigoDopedido, double valor_pedido) {
		super();
		this.codigoDoPedido = codigoDopedido;
		this.valor_pedido = valor_pedido;

	}

	public String getCodigoDoPedido() {
		return codigoDoPedido;
	}

	public void setCodigoDoPedido(String codigoDoPedido) {
		this.codigoDoPedido = codigoDoPedido;
	}

	public double getValor_pedido() {
		return valor_pedido;
	}

	public void setValor_pedido(double valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
}

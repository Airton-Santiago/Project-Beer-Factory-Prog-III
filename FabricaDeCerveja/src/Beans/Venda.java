package Beans;

public class Venda extends Pedido {

	private double valor;

	public Venda(double valor, String codigoDoPedido, double valor_pedido) {
      super (codigoDoPedido, valor_pedido);
		this.valor = valor;
	
		
	}
}
	
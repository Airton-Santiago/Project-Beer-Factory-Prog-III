package Beans;

public class Estoque extends Pedido{

	private String produto;
	private int quantidade_produto;

	public Estoque(String produto, int quantidade_produto, String codigoDoPedido, double valor_pedido) {
      super (codigoDoPedido, valor_pedido);
		this.produto = produto;
		this.quantidade_produto = quantidade_produto;
	}
	
}

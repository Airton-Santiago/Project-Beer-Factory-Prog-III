package Beans;

import java.sql.Date;

public class Venda extends Pedido {

	private double valor;
	private String produto;
	private String NomeCliente;
	private Date dataVenda;
	private String codigoDoPedido;
	private double valor_pedido;

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

	public Venda() {
		this.valor = valor;
		this.dataVenda = dataVenda;
		this.NomeCliente = NomeCliente;
		this.produto = produto;
		this.codigoDoPedido= codigoDoPedido;
		this.valor_pedido = valor_pedido;

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

}

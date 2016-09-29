package Beans;

import java.sql.Date;

public class Venda extends Pedido {

	private double valor;
	private String produto;
	private String NomeCliente;
	private Date dataVenda;

	public Venda(double valor, String codigoDoPedido, String produto, String NomeCliente, Date dataVenda,
			double valor_pedido) {
		super(codigoDoPedido, valor_pedido);
		this.valor = valor;
		this.dataVenda = dataVenda;
		this.NomeCliente = NomeCliente;
		this.produto = produto;

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

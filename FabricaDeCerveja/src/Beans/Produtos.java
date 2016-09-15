package Beans;

public class Produtos {

	private String codigoProduto;
	private double valor_produto;

	public Produtos() {

	}

	public Produtos(String codigoProduto, double valor_produto) {
		super();
		this.codigoProduto = codigoProduto;
		this.valor_produto = valor_produto;

	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
	}

}

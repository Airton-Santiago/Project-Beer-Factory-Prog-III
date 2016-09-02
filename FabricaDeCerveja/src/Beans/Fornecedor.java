package Beans;

public class Fornecedor {

	private String nome;
	private String cnpj;
	private String endereco;
	private String produto_fornecido;
	private int quantidade_produto;
	private double valor_servico;

	public Fornecedor() {

	}

	public Fornecedor(String nome, String cnpj, String endereco, String produto_fornecido, int quantidade_produto,
			double valor_servico) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.produto_fornecido = produto_fornecido;
		this.quantidade_produto = quantidade_produto;
		this.valor_servico = valor_servico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProduto_fornecido() {
		return produto_fornecido;
	}

	public void setProduto_fornecido(String produto_fornecido) {
		this.produto_fornecido = produto_fornecido;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public double getValor_servico() {
		return valor_servico;
	}

	public void setValor_servico(double valor_servico) {
		this.valor_servico = valor_servico;
	}

}

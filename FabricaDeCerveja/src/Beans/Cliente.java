package Beans;

public class Cliente  {

	private String cnpj;
	
	private String cpf;
	
	private String nome;
	

	private String endereco;
	
	private String quantidadeEmEstoque;
	
	public Cliente() {
	this.cnpj = cnpj;
	this.cpf=cpf;
	this.nome=nome;
	this.endereco=endereco;
		
	}
	
	public String getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	
	public void setQuantidadeEmEstoque(String quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}







}
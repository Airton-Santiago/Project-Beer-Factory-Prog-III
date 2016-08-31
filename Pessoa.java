package Beans;

public class Pessoa {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String endereco, double numero) {
		super();

	}

	public Pessoa(String nome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	private String endereco;

}

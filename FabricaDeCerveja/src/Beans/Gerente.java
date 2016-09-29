package Beans;

public class Gerente extends Pessoa {

	private String cpf;

	private String login;

	private String senha;

	public Gerente(String nome, String endereco, double numero, String cpf, String login, String senha) {
		super(nome, endereco, numero);
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

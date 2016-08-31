package Beans;

public class Cliente extends Pessoa {

	private String cnpj;

	public Cliente(String nome, String endereco, int numero) {
		super(nome, endereco, numero);
		this.cnpj = cnpj;

	}

}
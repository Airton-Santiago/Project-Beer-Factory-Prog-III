package Beans;

public class Gerente extends Pessoa{
	
	private String cpf;

	public Gerente(String cpf, String nome, String endereco, double numero) {
		super(nome, endereco, numero);
		this.cpf = cpf;
		
	}

}

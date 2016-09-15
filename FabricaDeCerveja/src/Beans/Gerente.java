package Beans;

public class Gerente extends Pessoa{

	private String cpf;
	
	public Gerente(String nome, String endereco, double numero, String cpf) {
		super(nome, endereco, numero);
		this.cpf = cpf;
		
	}

}

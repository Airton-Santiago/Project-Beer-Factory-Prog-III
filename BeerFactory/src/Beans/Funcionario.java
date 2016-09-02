package Beans;

public class Funcionario extends Pessoa {

	private double salario;

	public Funcionario(String nome, String cpf, String endereco, double salario) {
		super(nome, cpf, endereco);
		this.salario = salario;

	}

}

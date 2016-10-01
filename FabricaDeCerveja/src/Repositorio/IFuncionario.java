package Repositorio;

import Beans.Funcionario;

public interface IFuncionario {

	void cadastrar(Funcionario funcionario);

	Funcionario procurar(String cpf);

	void atualizar(Funcionario funcionario);

	void remover(Funcionario f);

	void remover(String cpf);
	
	static Funcionario procurar(Funcionario funcionario){
		return funcionario;
	
	}

}

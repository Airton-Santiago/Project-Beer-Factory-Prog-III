package Repositorio;

import Beans.Funcionario;

public interface IFuncionario extends IRepositorioFuncionario<Funcionario, String> {

	void cadastrar(Funcionario funcionario);
		
	}

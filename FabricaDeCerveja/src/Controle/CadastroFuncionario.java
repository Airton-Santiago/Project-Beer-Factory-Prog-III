package Controle;

import Beans.Funcionario;
import Repositorio.IFuncionario;
import Repositorio.IRepositorioFuncionario;

public class CadastroFuncionario implements IFuncionario {

	private IRepositorioFuncionario repositorio;

	@Override
	public void cadastrar(Funcionario funcionario) {
		this.repositorio.cadastrar(funcionario);

	}

	@Override
	public Funcionario procurar(String cpf) {

		return (Funcionario) repositorio.procurar(cpf);
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		this.repositorio.atualizar(funcionario);

	}

	@Override
	public void remover(String cpf) {
		this.repositorio.remover(cpf);

	}

}

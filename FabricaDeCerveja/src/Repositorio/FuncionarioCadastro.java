package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Funcionario;

public class FuncionarioCadastro<f> implements IFuncionario {

	private List<Funcionario> repositorio;

	public FuncionarioCadastro() {
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Funcionario funcionario) {
		repositorio.add(funcionario);

	}

	@Override
	public Funcionario procurar(String cpf) {
		for (int i = 0; i < repositorio.size(); i++) {
			Funcionario f = repositorio.get(i);
			if (f.getCpf().equals(cpf)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		for (int i = 0; i < repositorio.size(); i++) {
			Funcionario f = repositorio.get(i);
			if (f.getCpf().equals(funcionario.getCpf())) {
				repositorio.set(i, funcionario);
			}
		}

	}

	@Override
	public void remover(String cpf) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Funcionario f = this.repositorio.get(i);
			if (f.equals(cpf)) {
				repositorio.remove(f);

			}

		}
	}

	@Override
	public void remover(Funcionario f) {
		// TODO Auto-generated method stub
		
	}
}

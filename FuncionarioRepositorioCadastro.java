package Repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Beans.Cliente;
import Beans.Funcionario;
import Beans.Pessoa;

public class FuncionarioRepositorioCadastro<f> implements IFuncionario {

	private List<Funcionario> repositorio;

	public FuncionarioRepositorioCadastro() {
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
		Cliente funcionario = new Cliente(cpf, cpf, 0);
		funcionario.setCpf(cpf);
		repositorio.remove(funcionario);

		
	}



	}


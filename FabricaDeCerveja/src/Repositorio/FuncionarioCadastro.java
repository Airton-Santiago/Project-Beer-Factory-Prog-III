package Repositorio;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Funcionario;

public abstract class FuncionarioCadastro<c> implements IFuncionario {

	private List<Funcionario> repositorio;
	private Object funcionario;

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
			Funcionario c = repositorio.get(i);
			if (c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		for (int i = 0; i < repositorio.size(); i++) {
			Funcionario c = repositorio.get(i);
			if (c.getCpf().equals(funcionario.getCpf())) {
				repositorio.set(i, funcionario);
			}
		}

	}

	@Override
	public void remover(String cpf) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Funcionario c = this.repositorio.get(i);
			if (c.equals(cpf)) {
				repositorio.remove(funcionario);
			}

		}

	}

	@Override
	public Funcionario procurar(Funcionario c) {
		for (int i = 0; i < repositorio.size(); i++) {
			Funcionario c1 = repositorio.get(i);
			if (c1.getCpf().equals(c.getCpf())) {
				return c1;
			}
		}
		return null;
	}

	@Override
	public void remover(Funcionario c) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Funcionario c1 = this.repositorio.get(i);
			if (c.equals(c)) {
				repositorio.remove(c);
			}

		}
	}

	

	

	
	

	

	@Override
	public void remover(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
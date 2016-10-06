package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Fornecedor;
import Beans.Funcionario;

public class FornecedorCadastro<f> implements IFornecedor {

	private List<Fornecedor> repositorio;
	private Object fornecedor;

	public FornecedorCadastro() {
		repositorio = new ArrayList<>();
	}

	public void cadastrar(Fornecedor fornecedor) {
		repositorio.add(fornecedor);

	}

	@Override
	public Fornecedor procurar(String cnpj) {
		for (int i = 0; i < repositorio.size(); i++) {
			Fornecedor f = repositorio.get(i);
			if (f.getCnpj().equals(cnpj)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		for (int i = 0; i < repositorio.size(); i++) {
			Fornecedor f = repositorio.get(i);
			if (f.getCnpj().equals(fornecedor.getCnpj())) {
				repositorio.set(i, fornecedor);
			}
		}

	}

	@Override
	public void remover(String cnpj) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Fornecedor f = this.repositorio.get(i);
			if (f.equals(cnpj)) {
				repositorio.remove(fornecedor);
			}

		}

	}

	@Override
	public void remover(Funcionario f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fornecedor procurar(Fornecedor f) {
		for (int i = 0; i < repositorio.size(); i++) {
			Fornecedor f1 = repositorio.get(i);
			if (f.getCnpj().equals(f)) {
				return f1;
			}
		}
		return null;
	}
}

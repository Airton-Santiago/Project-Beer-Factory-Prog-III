package Controle;

import Beans.Fornecedor;
import Beans.Funcionario;
import Repositorio.IFornecedor;

public class CadastroFornecedor implements IFornecedor {

	private IFornecedor repositorio;

	public void cadastrar(Fornecedor fornecedor) {
		IFornecedor.cadastrar(fornecedor);

	}

	@Override
	public Fornecedor procurar(String cnpj) {
		return (Fornecedor) repositorio.procurar(cnpj);
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		this.repositorio.atualizar(fornecedor);

	}

	@Override
	public void remover(String cnpj) {
		this.repositorio.remover(cnpj);

	}

	@Override
	public void remover(Funcionario f) {
		// TODO Auto-generated method stub
		
	}

}

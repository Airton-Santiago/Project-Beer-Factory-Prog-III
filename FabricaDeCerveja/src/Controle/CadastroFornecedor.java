package Controle;

import Beans.Fornecedor;
import Repositorio.IFornecedor;

public class CadastroFornecedor implements IFornecedor {

	private IFornecedor repositorio;

	@Override
	public void cadastrar(Fornecedor fornecedor) {
		this.repositorio.cadastrar(fornecedor);

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

}

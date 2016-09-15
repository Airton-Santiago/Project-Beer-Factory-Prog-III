package Repositorio;

import Beans.Fornecedor;

public interface IFornecedor {
	
	void cadastrar(Fornecedor fornecedor);

	Fornecedor procurar(String cnpj);

	void atualizar(Fornecedor fornecedor);
	
	void remover(String cnpj);

}

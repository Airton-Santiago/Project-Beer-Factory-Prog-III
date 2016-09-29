package Repositorio;

import Beans.Fornecedor;
import Beans.Funcionario;

public interface IFornecedor {
	
	static void cadastrar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

	Fornecedor procurar(String cnpj);

	void atualizar(Fornecedor fornecedor);
	
	void remover(String cnpj);

	void remover(Funcionario f);

}

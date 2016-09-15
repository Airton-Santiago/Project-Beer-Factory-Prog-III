package Repositorio;

import Beans.Produtos;

public interface IProduto {
	
	void cadastrar(Produtos produto);

	Produtos procurar(String codigoProduto);

	void atualizar(Produtos produto);

	void remover(String codigoProduto);
}

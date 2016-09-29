package Repositorio;

import Beans.Produtos;
import Beans.Venda;

public interface IProduto {
	
	void cadastrar(Venda venda);
	
	void cadastrar (Produtos produto);

	Produtos procurar(String codigoProduto);

	void atualizar(Produtos produto);

	void remover(String codigoProduto);
}

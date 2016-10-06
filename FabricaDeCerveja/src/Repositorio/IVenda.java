package Repositorio;

import Beans.Venda;

public interface IVenda {

	void cadastrar (Venda venda);

	Venda procurar(String codigoDoPedido);

	void atualizar(Venda venda);
	
	void remover(String codigoDoPedido);

	void remover(Venda venda);
}

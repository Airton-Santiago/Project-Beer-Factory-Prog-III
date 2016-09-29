package Repositorio;

import Beans.*;

public interface IEstoque {
	
	void cadastrar(Estoque estoque);

	Estoque procurar(String codigoDoPedido);

	void atualizar(Estoque estoque);
	
	void remover(String codigoDoPedido);
}

package Controle;

import Beans.Estoque;
import Repositorio.IEstoque;

public class CadastroEstoque implements IEstoque {
	
	private IEstoque repositorio;

	@Override
	public void cadastrar(Estoque estoque) {
		this.repositorio.cadastrar(estoque);
		
	}

	@Override
	public Estoque procurar(String codigoDoPedido) {
		
		return (Estoque)repositorio.procurar(codigoDoPedido);
	}

	@Override
	public void atualizar(Estoque estoque) {
		this.repositorio.atualizar(estoque);
		
	}

	@Override
	public void remover(String codigoDoPedido) {
		this.repositorio.remover(codigoDoPedido);
		
	}

}

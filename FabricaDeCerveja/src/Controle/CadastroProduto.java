package Controle;

import Beans.Produtos;
import Beans.Venda;
import Repositorio.IProduto;


public class CadastroProduto implements IProduto {

	private IProduto repositorio;

	@Override
	public void cadastrar(Produtos produto) {

		this.repositorio.cadastrar(produto);

	}

	@Override
	public Produtos procurar(String codigoProduto) {

		return (Produtos) repositorio.procurar(codigoProduto);
	}

	@Override
	public void atualizar(Produtos produto) {

		this.repositorio.atualizar(produto);
	}

	@Override
	public void remover(String codigoProduto) {

		this.repositorio.remover(codigoProduto);

	}

	@Override
	public void cadastrar(Venda venda) {
		this.repositorio.cadastrar(venda);
		
	}

}
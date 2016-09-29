package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Produtos;
import Beans.Venda;

public class ProdutoCadastro<p> implements IProduto {

	private List<Produtos> repositorio;
	private List<Venda> repositorio1;
	private Object produto;

	public ProdutoCadastro() {
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Produtos produto) {
		repositorio.add(produto);

	}

	@Override
	public Produtos procurar(String codigoProduto) {
		for (int i = 0; i < repositorio.size(); i++) {
			Produtos p = repositorio.get(i);
			if (p.getCodigoProduto().equals(codigoProduto)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Produtos produto) {
		for (int i = 0; i < repositorio.size(); i++) {
			Produtos p = repositorio.get(i);
			if (p.getCodigoProduto().equals(produto.getCodigoProduto())) {
				repositorio.set(i, produto);
			}
		}

	}

	@Override
	public void remover(String codigoProduto) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Produtos p = this.repositorio.get(i);
			if (p.equals(codigoProduto)) {
				repositorio.remove(produto);
			}

		}

	}

	@Override
	public void cadastrar(Venda venda) {
		repositorio1.add(venda);
		
	}

	@Override
	public void remover(Venda venda) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Venda v = this.repositorio1.get(i);
			if (v.equals(venda)) {
				repositorio.remove(produto);
			}

		}
		
	}

	@Override
	public void remover(IProduto cadastroProduto) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Produtos p = this.repositorio.get(i);
			if (p.equals(cadastroProduto)) {
				repositorio.remove(produto);
			}

		}

		
	}

}
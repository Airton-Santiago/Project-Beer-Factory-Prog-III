package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Cliente;
import Beans.Estoque;
import Beans.Fornecedor;

public class EstoqueCadastro implements IEstoque{
	
	private List<Estoque> repositorio;
	private Object estoque;

	public EstoqueCadastro() {
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Estoque estoque) {
		repositorio.add(estoque);
		
	}

	@Override
	public Estoque procurar(String codigoDoPedido) {
		for (int i = 0; i < repositorio.size(); i++) {
			Estoque e = repositorio.get(i);
			if (e.getCodigoDoPedido().equals(codigoDoPedido)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Estoque estoque) {
		for (int i = 0; i < repositorio.size(); i++) {
			Estoque e = repositorio.get(i);
			if (e.getCodigoDoPedido().equals(estoque.getCodigoDoPedido())) {
				repositorio.set(i, estoque);
			}
		}

	}

	@Override
	public void remover(String codigoDoPedido) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Estoque e = this.repositorio.get(i);
			if (e.equals(codigoDoPedido)) {
				repositorio.remove(estoque);
			}

		}

	}

	

}

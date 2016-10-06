package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Estoque;
import Beans.Venda;

public class VendaCadastro implements IVenda {

	private List<Venda> repositorio;
	private Object venda;

	public VendaCadastro() {
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Venda venda) {
		repositorio.add(venda);

	}

	@Override
	public Venda procurar(String codigoDoPedido) {
		for (int i = 0; i < repositorio.size(); i++) {
			Venda v = repositorio.get(i);
			if (v.getCodigoDoPedido().equals(codigoDoPedido)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Venda venda) {
		for (int i = 0; i < repositorio.size(); i++) {
			Venda v = repositorio.get(i);
			if (v.getCodigoDoPedido().equals(venda.getCodigoDoPedido())) {
				repositorio.set(i, venda);
			}
		}

	}

	@Override
	public void remover(String codigoDoPedido) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Venda v = this.repositorio.get(i);
			if (v.equals(codigoDoPedido)) {
				repositorio.remove(venda);
			}

		}

	}

	@Override
	public void remover(Venda venda) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Venda v = this.repositorio.get(i);
			if (v.equals(venda)) {
				repositorio.remove(venda);
			}

		}

	}
}

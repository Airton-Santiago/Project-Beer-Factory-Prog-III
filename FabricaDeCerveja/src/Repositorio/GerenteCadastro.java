package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Gerente;

public class GerenteCadastro<g> implements IGerente {

	private List<Gerente> repositorio;
	private Object gerente;

	public GerenteCadastro() {
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Gerente gerente) {
		repositorio.add(gerente);

	}

	@Override
	public Gerente procurar(String cpf) {
		for (int i = 0; i < repositorio.size(); i++) {
			Gerente g = repositorio.get(i);
			if (g.getCpf().equals(cpf)) {
				return g;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Gerente gerente) {
		for (int i = 0; i < repositorio.size(); i++) {
			Gerente g = repositorio.get(i);
			if (g.getCpf().equals(gerente.getCpf())) {
				repositorio.set(i, gerente);
			}
		}

	}

	@Override
	public void remover(String cpf) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Gerente g = this.repositorio.get(i);
			if (g.equals(cpf)) {
				repositorio.remove(gerente);
			}

		}

	}

}
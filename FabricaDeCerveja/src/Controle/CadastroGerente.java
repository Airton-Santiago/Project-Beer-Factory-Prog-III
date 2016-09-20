package Controle;

import Beans.Gerente;
import Repositorio.IGerente;

public class CadastroGerente implements IGerente {

	private IGerente repositorio;

	@Override
	public void cadastrar(Gerente gerente) {
		this.repositorio.cadastrar(gerente);

	}

	@Override
	public Gerente procurar(String cpf) {

		return (Gerente) repositorio.procurar(cpf);
	}

	@Override
	public void atualizar(Gerente gerente) {
		this.repositorio.atualizar(gerente);

	}

	@Override
	public void remover(String cpf) {
		this.repositorio.remover(cpf);

	}

}

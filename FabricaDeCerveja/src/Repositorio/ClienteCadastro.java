package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Beans.Cliente;

public class ClienteCadastro<c> implements ICliente {

	private List<Cliente> repositorio;
	private Object cliente;

	public ClienteCadastro() {
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Cliente cliente) {
		repositorio.add(cliente);
	}

	@Override
	public Cliente procurar(String cpf) {
		for (int i = 0; i < repositorio.size(); i++) {
			Cliente c = repositorio.get(i);
			if (c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Cliente cliente) {
		for (int i = 0; i < repositorio.size(); i++) {
			Cliente c = repositorio.get(i);
			if (c.getCpf().equals(cliente.getCpf())) {
				repositorio.set(i, cliente);
			}
		}

	}

	@Override
	public void remover(String cpf) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Cliente c = this.repositorio.get(i);
			if (c.equals(cpf)) {
				repositorio.remove(cliente);
			}

		}

	}
}
	
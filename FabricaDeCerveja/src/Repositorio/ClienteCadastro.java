package Repositorio;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Funcionario;

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

	@Override
	public Cliente procurar(Cliente c) {
		for (int i = 0; i < repositorio.size(); i++) {
			Cliente c1 = repositorio.get(i);
			if (c1.getCpf().equals(c.getCpf())) {
				return c1;
			}
		}
		return null;
	}

	@Override
	public void remover(Cliente c) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Cliente c1 = this.repositorio.get(i);
			if (c.equals(c)) {
				repositorio.remove(c);
			}

		}
	}

	@Override
	public void remover(ActionEvent e) {
		for (int i = 0; i <= this.repositorio.size(); i++) {
			Cliente c1 = this.repositorio.get(i);
			if (c1.equals(c1)) {
				repositorio.remove(cliente);
			}
		}
	}

	@Override
	public List<Fornecedor> procurar(Fornecedor f) {
		for (int i = 0; i < repositorio.size(); i++) {
			Cliente f1 = repositorio.get(i);
			if (f1.getCpf().equals(f1)) {
				return (List<Fornecedor>) f1;
			}
		}
		
		return null;
	}

	@Override
	public Cliente procurar(Funcionario f) {
		// TODO Auto-generated method stub
		return null;
	}
}
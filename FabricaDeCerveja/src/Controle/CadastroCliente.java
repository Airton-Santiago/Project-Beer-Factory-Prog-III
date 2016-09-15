package Controle;

import Beans.Cliente;
import Repositorio.ICliente;

public class CadastroCliente implements ICliente {

	private ICliente repositorio;

	@Override
	public void cadastrar(Cliente cliente) {
		this.repositorio.cadastrar(cliente);
	}

	@Override
	public Cliente procurar(String cpf) {
		return (Cliente) repositorio.procurar(cpf);
	}

	@Override
	public void atualizar(Cliente cliente) {
		this.repositorio.atualizar(cliente);

	}

	@Override
	public void remover(String cpf) {
		this.repositorio.remover(cpf);

	}

}

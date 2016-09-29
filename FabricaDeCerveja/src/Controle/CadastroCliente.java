package Controle;

import java.awt.event.ActionEvent;
import java.util.List;

import Beans.Cliente;
import Beans.Fornecedor;
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

	@Override
	public Cliente procurar(Cliente c) {
		return (Cliente)repositorio.procurar(c);
	}

	@Override
	public void remover(Cliente c) {
		this.repositorio.remover(c);
		
	}

	@Override
	public void remover(ActionEvent e) {
		this.repositorio.remover(e);
		
	}

	@Override
	public List<Fornecedor> procurar(Fornecedor f) {
		
		return (List<Fornecedor>)repositorio.procurar(f);
	}

}

package Controle;

import java.awt.event.ActionEvent;
import java.util.List;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Funcionario;
import Repositorio.ClienteCadastro;
import Repositorio.FuncionarioCadastro;
import Repositorio.ICliente;
import Repositorio.IFuncionario;

public class CadastroFuncionario implements IFuncionario {

	private FuncionarioCadastro repositorio;

	@Override
	public void cadastrar(Funcionario funcionario) {
		this.repositorio.cadastrar(funcionario);
	}

	@Override
	public Funcionario procurar(String cpf) {
		return (Funcionario) repositorio.procurar(cpf);
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		this.repositorio.atualizar(funcionario);

	}

	@Override
	public void remover(String cpf) {
		this.repositorio.remover(cpf);

	}

	

	@Override
	public void remover(Funcionario c) {
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

	

	@Override
	public Funcionario procurar(Funcionario f) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

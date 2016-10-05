package Repositorio;

import java.awt.event.ActionEvent;
import java.util.List;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Funcionario;

public interface IFuncionario {
	
	void cadastrar(Funcionario funcionario);

	

	Funcionario procurar(Funcionario c);
	
	void atualizar(Funcionario funcionario);
	
	void remover(ActionEvent e);
	
	void remover(Funcionario c);

	void remover(String cpf);

	List<Fornecedor> procurar(Fornecedor f);

	Funcionario procurar(String cpf);


}

package Repositorio;

import java.awt.event.ActionEvent;
import java.util.List;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Funcionario;

public interface ICliente {
	
	void cadastrar(Cliente cliente);

	Cliente procurar(Funcionario f);

	Cliente procurar(Cliente c);
	
	void atualizar(Cliente cliente);
	
	void remover(ActionEvent e);
	
	void remover(Cliente c);

	void remover(String cpf);

	List<Fornecedor> procurar(Fornecedor f);

	Cliente procurar(String cpf);


}

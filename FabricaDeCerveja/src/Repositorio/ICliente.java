package Repositorio;

import Beans.Cliente;

public interface ICliente {
	
	void cadastrar(Cliente cliente);

	Cliente procurar(String cpf);

	void atualizar(Cliente cliente);
	
	void remover(String cpf);

}

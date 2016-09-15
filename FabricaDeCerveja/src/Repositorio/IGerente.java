package Repositorio;

import Beans.Gerente;

public interface IGerente <g>{
	
	void cadastrar(Gerente gerente);

	Gerente procurar(String cpf);

	void atualizar(Gerente gerente);
	
	void remover(String cpf);

}

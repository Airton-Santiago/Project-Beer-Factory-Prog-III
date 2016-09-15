package Repositorio;

import Beans.Funcionario;

public interface IRepositorioFuncionario<T, ID> {

	void cadastrar(T entity);

	T procurar(ID chave);

	void atualizar(T entity);

	void remover(ID chave);

	Object procurar(String cpf);

	void atualizar(Funcionario funcionario);

}

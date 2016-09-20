package Fachada;

import Beans.*;

public interface IFachada {

	void cadastrarCliente(Cliente cliente);

	void cadastrarFuncionario(Funcionario funcionario);

	void cadastrarFornecedor(Fornecedor fornecedor);

	void cadastrarGerente(Gerente gerente);

	void cadastrarProduto(Produtos produto);

	Cliente procurarCliente(String cpf);

	Funcionario procurarFuncionario(String cpf);

	void procurarProduto(String codigoProduto);

	void procurarGerente(String cpf);

	void procurarFornecedor(String cnpj);

	void atualizarCliente(Cliente cliente);

	void atualizarFuncionario(Funcionario funcionario);

	void atualizarFornecedor(Fornecedor fornecedor);

	void atualizarGerente(Gerente gerente);

	void atualizarProduto(Produtos produto);

	void removerCliente(String cpf);

	void removerFuncionario(String cpf);

	void removerGerente(String cpf);

	void removerFornecedor(String cpf);

	void removerProduto(String codigoProduto);

}
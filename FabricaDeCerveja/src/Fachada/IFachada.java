package Fachada;

import java.awt.event.ActionEvent;

import Beans.*;

public interface IFachada {

	void cadastrarCliente(Cliente cliente);

	void cadastrarFuncionario(Funcionario funcionario);

	static void cadastrarFornecedor(Fornecedor fornecedor) {
		return;
	}

	void cadastrarGerente(Gerente gerente);

	void cadastrarProduto(Venda venda);
	
	void cadastrarProduto(Produtos produto);
	
	Cliente procurarCliente(String cpf);

	static Cliente procurarCliente(Cliente c) {
		return null;
	}

	static void procurarFuncionario (Funcionario funcionario){
		return;
	}

	void procurarProduto(String codigoProduto);

	void procurarGerente(String cpf);

	void procurarFornecedor(String cnpj);

	void atualizarCliente(Cliente cliente);

	void atualizarFuncionario(Funcionario funcionario);

	void atualizarFornecedor(Fornecedor fornecedor);

	void atualizarGerente(Gerente gerente);

	void atualizarProduto(Produtos produto);

	void removerFuncionario(String cpf);

	void removerGerente(String cpf);

	void removerFornecedor(String cpf);

	void removerProduto(Venda venda);

	void removerProduto(String codigoProduto);
	
	static Cliente removerCliente(Cliente c) {
		return null;
	}
		void removerProduto(ActionEvent e);
	
	

}
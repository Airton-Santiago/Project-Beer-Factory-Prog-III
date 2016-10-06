package Fachada;

import Controle.*;
import Repositorio.*;

import java.awt.event.ActionEvent;
import java.util.List;

import Beans.*;

public class Fachada implements IFachada {

	private static ClienteCadastro cadastroCliente;
	private static IFuncionario cadastroFuncionario;
	private IGerente cadastroGerente;
	private IProduto cadastroProduto;
	private static IFornecedor cadastroFornecedor;
	private static IFachada fachada;
	private static IVenda cadastroVenda;

	public static IFachada getInstance() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;

	}

	public Fachada() {
		this.cadastroCliente = new ClienteCadastro();
		this.cadastroFuncionario = new CadastroFuncionario();
		this.cadastroFornecedor = new CadastroFornecedor();
		this.cadastroGerente = new CadastroGerente();
		this.cadastroProduto = new CadastroProduto();
		this.cadastroVenda = new CadastroVenda();

	}

	@Override
	public void cadastrarCliente(Cliente cliente) {
		cadastroCliente.cadastrar(cliente);

	}

	@Override
	public void cadastrarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.cadastrar(funcionario);
	}

	public static void cadastrarFornecedor(Fornecedor fornecedor) {
		IFornecedor.cadastrar(fornecedor);

	}

	@Override
	public void cadastrarGerente(Gerente gerente) {
		cadastroGerente.cadastrar(gerente);

	}

	@Override
	public void cadastrarProduto(Produtos produto) {
		cadastroProduto.cadastrar(produto);

	}

	@Override
	public Cliente procurarCliente(String cpf) {

		return cadastroCliente.procurar(cpf);
	}

	@Override
	public void procurarProduto(String codigoProduto) {

		this.cadastroProduto.procurar(codigoProduto);

	}

	@Override
	public void procurarGerente(String cpf) {
		this.cadastroGerente.procurar(cpf);

	}

	@Override
	public void procurarFornecedor(String cnpj) {
		this.cadastroFornecedor.procurar(cnpj);

	}

	@Override
	public void atualizarCliente(Cliente cliente) {
		cadastroCliente.atualizar(cliente);

	}

	@Override
	public void atualizarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.atualizar(funcionario);

	}

	@Override
	public void atualizarFornecedor(Fornecedor fornecedor) {
		cadastroFornecedor.atualizar(fornecedor);

	}

	@Override
	public void atualizarGerente(Gerente gerente) {
		cadastroGerente.atualizar(gerente);

	}

	@Override
	public void atualizarProduto(Produtos produto) {
		cadastroProduto.atualizar(produto);

	}

	public static void removerCliente(String cpf) {
		cadastroCliente.remover(cpf);

	}

	@Override
	public void removerFuncionario(String cpf) {
		cadastroFuncionario.remover(cpf);

	}

	@Override
	public void removerGerente(String cpf) {
		cadastroGerente.remover(cpf);

	}

	@Override
	public void removerFornecedor(String cnpj) {
		cadastroFornecedor.remover(cnpj);

	}

	@Override
	public void removerProduto(String codigoProduto) {
		cadastroProduto.remover(codigoProduto);

	}

	public static void removerCliente(Cliente c1) {
		cadastroCliente.remover(c1);

	}

	public static Cliente procurarCliente(Cliente c) {

		return cadastroCliente.procurar(c);
	}

	public static Funcionario procurarFuncionario(Funcionario c) {

		return cadastroFuncionario.procurar(c);
	}

	@Override
	public void cadastrarProduto(Venda venda) {
		cadastroProduto.cadastrar(venda);

	}

	@Override
	public void removerProduto(ActionEvent e) {
		cadastroCliente.remover(e);

	}

	public static Fornecedor procurarFornecedor(Fornecedor f) {

		return cadastroFornecedor.procurar(f);
	}

	public static Cliente procurarCliente1(Cliente cliente) {

		return cadastroCliente.procurar(cliente);
	}

	public static void removerFuncionario(Funcionario f) {
		cadastroFornecedor.remover(f);

	}

	@Override
	public void removerProduto(Venda venda) {
		cadastroProduto.remover(cadastroProduto);

	}

	public void cadastrarVenda(Venda venda) {
		cadastroVenda.cadastrar(venda);

	}

	public static void removerVenda(Venda venda) {
		cadastroVenda.remover(venda);

	}

	public static void listarCliente(Cliente cliente) {
		cadastroCliente.listar(cliente);

	}

}

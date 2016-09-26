package Fachada;
import Beans.Cliente;
import Controle.*;
import Repositorio.*;
import Beans.*;

public class Fachada implements IFachada {

	private ICliente cadastroCliente;
	private IFuncionario cadastroFuncionario;
	private IGerente cadastroGerente;
	private IProduto cadastroProduto;
	private IFornecedor cadastroFornecedor;
	private static IFachada fachada;

	public static IFachada getInstance() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	
	}

	public Fachada() {
		this.cadastroCliente = new CadastroCliente();
		this.cadastroFuncionario = new CadastroFuncionario();
		this.cadastroFornecedor = new CadastroFornecedor();
		this.cadastroGerente = new CadastroGerente();
		this.cadastroProduto = new CadastroProduto();

	}

	@Override
	public void cadastrarCliente(Cliente cliente) {
		cadastroCliente.cadastrar(cliente);

	}

	@Override
	public void cadastrarFuncionario(Funcionario funcionario) {
		cadastroFuncionario.cadastrar(funcionario);
	}

	@Override
	public void cadastrarFornecedor(Fornecedor fornecedor) {
		cadastroFornecedor.cadastrar(fornecedor);

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
	public Funcionario procurarFuncionario(String cpf) {

		return cadastroFuncionario.procurar(cpf);

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

	@Override
	public void removerCliente(String cpf) {
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

}


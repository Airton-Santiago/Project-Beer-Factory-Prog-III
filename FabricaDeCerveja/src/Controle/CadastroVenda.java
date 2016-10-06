package Controle;

import Beans.Venda;
import Repositorio.IVenda;
import Repositorio.VendaCadastro;

public class CadastroVenda implements IVenda {

	private VendaCadastro repositorio;

	@Override
	public void cadastrar(Venda venda) {
		this.repositorio.cadastrar(venda);

	}

	@Override
	public Venda procurar(String codigoDoPedido) {
		return (Venda) repositorio.procurar(codigoDoPedido);
	}

	@Override
	public void atualizar(Venda venda) {
		this.repositorio.atualizar(venda);

	}

	@Override
	public void remover(String codigoDoPedido) {
		this.repositorio.remover(codigoDoPedido);

	}

	@Override
	public void remover(Venda venda) {
		this.repositorio.remover(venda);
		
	}

}

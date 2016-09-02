package Beans;

import java.util.Date;

public class Transportadora {

	private String nome;
	private Date prazo;
	private String endereco_entrega;

	public Transportadora() {

	}

	public Transportadora(String nome, Date prazo, String endereco_entrega) {
		this.nome = nome;
		this.prazo = prazo;
		this.endereco_entrega = endereco_entrega;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public String getEndereco_entrega() {
		return endereco_entrega;
	}

	public void setEndereco_entrega(String endereco_entrega) {
		this.endereco_entrega = endereco_entrega;
	}

	

}

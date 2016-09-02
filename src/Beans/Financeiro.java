package Beans;
import java.util.Date;

public class Financeiro {

	private double faturamento;
	private double lucro;
	private double despesas;

	public Financeiro(Date data_pagamento, double faturamento2, double lucro2, double despesas2) {

	}

	public Financeiro(double faturamento, double lucro, double despesas) {
		super();
		this.faturamento = faturamento;
		this.lucro = lucro;
		this.despesas = despesas;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

}

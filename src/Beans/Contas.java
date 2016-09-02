package Beans;
import java.util.Date;

public class Contas extends Financeiro{

	private double valorPagar;
	private Date data_pagamento;

	public Contas (double valorPagar, Date data_pagamento, double faturamento, double lucro, double despesas){
		super(data_pagamento, faturamento, lucro, despesas);
		this.valorPagar = valorPagar;
		this.data_pagamento = data_pagamento;
	}
}

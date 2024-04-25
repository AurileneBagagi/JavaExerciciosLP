package herancaepolimorfismo;


public class FuncionarioTerceirizados extends Funcionario {
	
	private Double despesaAdicional;
	
	public FuncionarioTerceirizados() {
		super();
	}

	public FuncionarioTerceirizados(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}

}

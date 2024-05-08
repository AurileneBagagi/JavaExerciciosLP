package herancaepolimorfismo;

public class PessoaJuridica extends Contribuinte{

	Integer quantidadeFuncionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendimentoAnual, Integer quantidadeFuncionario) {
		super(nome, rendimentoAnual);
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	public Integer getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}

	public void setQuantidadeFuncionario(Integer quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	@Override
	public Double imposto() {
		if (quantidadeFuncionario>10) {
			return getRendimentoAnual()*0.14;
		} else {
			return getRendimentoAnual()*0.16;
		}
	}
}

package herancaepolimorfismo;

public class PessoaFisica extends Contribuinte {
	
	Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendimentoAnual, Double gastosComSaude) {
		super(nome, rendimentoAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double imposto() {
		if( getRendimentoAnual()<20000.00 ) {
			return (getRendimentoAnual()* 0.15) - (gastosComSaude*0.5);
		} else {
			return (getRendimentoAnual()* 0.25) - (gastosComSaude*0.5);
		}
	}
}

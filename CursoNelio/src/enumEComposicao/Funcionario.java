package enumEComposicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
	
	private String nome;
	private Experiencia nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList();
	
	public Funcionario() {
	}

	public Funcionario(String nome, Experiencia nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Experiencia getNivel() {
		return nivel;
	}

	public void setNivel(Experiencia nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}
	
	public void addContrato(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(Integer anoBusca, Integer mesBusca) {
		double renda = salarioBase;
		Calendar calendario = Calendar.getInstance();
		
		for(HorasContrato contrato : contratos) {
			calendario.setTime(contrato.getData());
			int mes = 1 + calendario.get(Calendar.MONTH);
			int ano = calendario.get(Calendar.YEAR);
			
			if (ano == anoBusca && mes==mesBusca) {
				renda += contrato.valorTotal();
			}
		}
		return renda;
	}
	
}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumEComposicao.Departamento;
import enumEComposicao.Experiencia;
import enumEComposicao.Funcionario;
import enumEComposicao.HorasContrato;

public class FuncionariosProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dataFormatado = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Digite o nome do Departamento: ");
		String departamento = scanner.nextLine();
		System.out.println("Digite os dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Experiencia: ");
		String experiencia = scanner.nextLine();
		System.out.print("Salario Base: ");
		Double salarioBase = scanner.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, Experiencia.valueOf(experiencia), salarioBase, 
				new Departamento(departamento));
		
		System.out.print("Quantos contratos tem esse funcionario? ");
		int quantidade = scanner.nextInt();
		
		for (int x=1; x<=quantidade; x++) {
			System.out.printf("Digite os dados do contrato %d:%n",x);
			System.out.print("Data (DD/MM/AAAA): ");
			Date data = dataFormatado.parse(scanner.next());
			System.out.print("Valor por Hora: ");
			Double valorHora = scanner.nextDouble();
			System.out.print("Duração (Horas): ");
			int duracao = scanner.nextInt();
			
			HorasContrato novoContrato = new HorasContrato(data, valorHora, duracao);
			funcionario.addContrato(novoContrato);
		}
		
		System.out.print("\nDigite o mês e o ano para calcular a renda (MM/AAAA): ");
		String mesAno = scanner.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: "+ funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.printf("Renda de %s = %.2f\n", mesAno, funcionario.renda(ano, mes));
		
		scanner.close();
		
	}

}

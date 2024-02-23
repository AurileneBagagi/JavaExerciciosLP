package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import listaVetores.Funcionario;

public class FuncionarioProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Quantos funcionarios você quer registrar? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nFuncionario #%d:\n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine(); //quebra de linha do input anterior
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}
		
		System.out.print("\nDigite o ID do funcionario a receber o aumento de salario: ");
		int id = sc.nextInt();
		
		Funcionario identificacao = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (identificacao==null) {
			System.out.println("Esse ID não existe");
		} else {
			System.out.print("Qual a porcentagem: ");
			double porcentagem = sc.nextDouble();
			identificacao.aumentoSalario(porcentagem);
		}
		
		System.out.println("\nLista de funcionários:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
	
	/*
	 * public static boolean posicao(List<Funcionario> funcionario, int id) {
	 * Funcionario identificacao = funcionario.stream().filter(x -> x.getId() ==
	 * id).findFirst().orElse(null); return identificacao != null; }
	 */

}

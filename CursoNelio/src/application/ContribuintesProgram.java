package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaepolimorfismo.Contribuinte;
import herancaepolimorfismo.PessoaFisica;
import herancaepolimorfismo.PessoaJuridica;

public class ContribuintesProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		System.out.print("Digite o numero de contribuintes: ");
		int n = scanner.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("\nDados do Contribuinte #" + i + ":");
			System.out.print("Pessoa Juridica ou Pessoa Fisica (j/f)? ");
			char tipo = scanner.next().charAt(0);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Rendimento Anual: ");
			Double rendimentoAnual = scanner.nextDouble();
			
			if(tipo == 'f') {
				System.out.print("Despesas com Saude: ");
				Double gastosComSaude = scanner.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendimentoAnual, gastosComSaude));
				
			} else {
				System.out.print("Quantidade de Funcionarios: ");
				Integer quantidadeFuncionarios = scanner.nextInt();
				contribuintes.add(new PessoaJuridica(nome, rendimentoAnual, quantidadeFuncionarios));
			}
		}
		double soma = 0.0;
		System.out.println("\nIMPOSTOS");
		for (Contribuinte contribuinte: contribuintes) {
			double imposto = contribuinte.imposto();
			System.out.println(contribuinte.getNome() + "R$ " + String.format("%.2f", imposto));
			soma+=imposto;
		}
		System.out.println("\nImpostos Total: R$ " + soma);
		scanner.close();
	}
}


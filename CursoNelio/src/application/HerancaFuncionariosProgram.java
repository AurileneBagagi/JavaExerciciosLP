package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaepolimorfismo.Funcionario;
import herancaepolimorfismo.FuncionarioTerceirizados;

public class HerancaFuncionariosProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Digite o numero de funcionarios: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Funcionario #" + i + ":");
			System.out.print("Terceirizado (S/N)? ");
			char terceirizado = scanner.next().charAt(0);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Horas: ");
			int horas = scanner.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = scanner.nextDouble();
			
			if (terceirizado == 'S') {
				System.out.print("Despesa Adicionail: ");
				double despesaAdicional = scanner.nextDouble();
				lista.add(new FuncionarioTerceirizados(nome, horas, valorPorHora, despesaAdicional));
			
			} else {
				lista.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		
		System.out.println("\nPAGAMENTOS: ");
		
		for (Funcionario funcionario: lista ) {
			System.out.printf("%s - R$ %.2f\n", funcionario.getNome(), funcionario.pagamento());
		}
		
		scanner.close();
	}

}

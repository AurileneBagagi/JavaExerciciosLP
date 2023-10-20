package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitadas? ");
		int tamVetor= sc.nextInt();
		String[] nomes = new String[tamVetor];
		double[] prim = new double[tamVetor];
		double[] segun = new double[tamVetor];
		
		for (int i=0; i<tamVetor; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			prim[i] = sc.nextDouble();
			segun[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados");
		for (int i = 0; i < tamVetor; i++) {
			if (prim[i]+segun[i]/2>=6.0)
				System.out.println(nomes[i]);
		}
		
		sc.close();
	}

}

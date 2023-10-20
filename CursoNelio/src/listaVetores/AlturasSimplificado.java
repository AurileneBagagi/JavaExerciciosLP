package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class AlturasSimplificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int tamVetor= sc.nextInt();
		double soma =0, menores=0;
		String[] nomes = new String[tamVetor];
		int[] idades = new int[tamVetor];
		double[] alturas = new double[tamVetor];
		
		for (int i=0; i<tamVetor; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < tamVetor; i++) {
			soma+=alturas[i];
			if (idades[i]<16)
				menores++;
		}
		
		System.out.printf("\nAltura média: %.2f", soma/tamVetor);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", menores/tamVetor*100);
		
		for (int i = 0; i < tamVetor; i++) {
			if (idades[i]<16)
				System.out.println(nomes[i]);
		}
		
		sc.close();
	}

}

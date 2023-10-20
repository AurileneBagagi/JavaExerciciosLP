package application;

import java.util.Locale;
import java.util.Scanner;
import listaVetores.Alturas;

public class AlturasProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int tamVetor= sc.nextInt();
		double soma =0, menores=0;
		Alturas[] pessoas = new Alturas[tamVetor];
		
		for (int i=0; i<pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoas[i] = new Alturas(nome, idade, altura);
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			soma+=pessoas[i].getAltura();
			if (pessoas[i].getIdade()<16)
				menores++;
		}
		
		System.out.printf("\nAltura média: %.2f", soma/tamVetor);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", menores/tamVetor*100);
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade()<16)
				System.out.println(pessoas[i].getNome());
		}
		
		sc.close();
	}

}

package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.print("Quantos numeros você vai digitar? ");
		int tamVetor= sc.nextInt();
		double[] numeros = new double[tamVetor];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			numeros[i]= numero;
			soma+=numero;
		}
		
		System.out.print("\nVALORES =");
		for (int i=0; i<numeros.length; i++) {
			System.out.printf(" %.1f", numeros[i]);
		}
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", soma/tamVetor);
		
	}

}

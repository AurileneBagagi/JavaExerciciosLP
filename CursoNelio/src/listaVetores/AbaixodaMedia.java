package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixodaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		double soma=0, media=0;
		int tamVetor= sc.nextInt();
		double[] numeros = new double[tamVetor];
		
		for (int i=0; i<tamVetor; i++) {
			System.out.print("Digite um número: ");
			numeros[i]= sc.nextDouble();
			soma+=numeros[i];
		}
		
		media = soma/tamVetor;
		System.out.printf("\nMEDIA DO VETOR = %.3f", media);
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i=0; i<tamVetor; i++) {
			if (numeros[i]<media)
				System.out.println(numeros[i]);
		}
		
		sc.close();

	}

}

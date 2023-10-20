package listaVetores;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int soma=0, contador=0;
		int tamVetor= sc.nextInt();
		int[] numeros = new int[tamVetor];
		
		for (int i=0; i<tamVetor; i++) {
			System.out.print("Digite um número: ");
			numeros[i]= sc.nextInt();
			if (numeros[i]%2==0) {
				soma+=numeros[i];
				contador++;
			}
		}
		
		if (contador!=0) 
			System.out.printf("MEDIA DOS PARES = %.1f%n", (double) soma/contador);
		else
			System.out.println("NENHUM NUMERO PAR");
		
		sc.close();
	}

}

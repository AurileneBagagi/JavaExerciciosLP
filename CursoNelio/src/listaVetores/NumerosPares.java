package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int quantidade = 0;
		int tamVetor= sc.nextInt();
		int[] numeros = new int[tamVetor];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i]= sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				System.out.print(" " + numeros[i]);
				quantidade++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + quantidade);
		
		sc.close();
	}

}

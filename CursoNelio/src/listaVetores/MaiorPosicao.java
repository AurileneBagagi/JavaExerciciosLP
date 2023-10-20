package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		double maior=0;
		int posicao=0;
		int tamVetor= sc.nextInt();
		double[] numeros = new double[tamVetor];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i]= sc.nextDouble();
			if (numeros[i]>maior) {
				maior = numeros[i];
				posicao=i;
				}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = "+ posicao);
		
		
		sc.close();

	}

}

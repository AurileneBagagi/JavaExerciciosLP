package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int tamVetor= sc.nextInt();
		int[] numeros = new int[tamVetor];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Digite um número: ");
			int numero= sc.nextInt();
			numeros[i]=numero;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i] <0)
				System.out.println(numeros[i]);
		}
		
		sc.close();
	}

}

package listaVetores;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int tamVetor= sc.nextInt();
		int[] a = new int[tamVetor];
		int[] b = new int[tamVetor];
		int[] resultante = new int[tamVetor];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < b.length; i++) {
			b[i]= sc.nextInt();
			resultante[i]= a[i]+b[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < resultante.length; i++) {
			System.out.println(resultante[i]);
		}
		
		sc.close();
		
	}

}

package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int tamVetor= sc.nextInt();
		int maisVelha=0, ind= 0;
		String[] nomes = new String[tamVetor];
		int[] idades = new int[tamVetor];
		
		for (int i=0; i<tamVetor; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			if (idades[i]>maisVelha) {
				maisVelha=idades[i];
				ind=i;
			}
		}
	
		System.out.println("PESSOA MAIS VELHA: "+ nomes[ind]);	
		
		sc.close();
	}

}

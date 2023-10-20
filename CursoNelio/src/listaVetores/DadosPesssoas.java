package listaVetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPesssoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitadas? ");
		int tamVetor= sc.nextInt();
		double menor=2.0, maior=0, soma=0;
		int homens=0, mulheres=0;
		double[] alturas = new double[tamVetor];
		char[] genero = new char[tamVetor];
		
		for (int i = 0; i < tamVetor; i++) {
			System.out.printf("Altura da %da pessoa: ",i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ",i+1);
			genero[i] = sc.next().charAt(0);
			
			menor = (alturas[i]<menor)? alturas[i]: menor;
			maior = (alturas[i]>maior)? alturas[i]: maior;
			
			if (genero[i] == 'F') {
				soma+=alturas[i];
				mulheres++;
			} else {
				homens++;
			}
			
		}
		
		System.out.printf("Menor altura = %.2f\n", menor);
		System.out.printf("Maior altura = %.2f\n", maior);
		System.out.printf("Médias das alturas das mulheres = %.2f\n", (double) soma/mulheres);
		System.out.printf("Numero de homens = %d\n", homens);
		
		sc.close();
	}

}

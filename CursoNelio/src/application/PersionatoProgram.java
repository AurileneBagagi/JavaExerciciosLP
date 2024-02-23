package application;

import java.util.Scanner;

import listaVetores.Persionato;

public class PersionatoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Persionato[] quartos = new Persionato[10];
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int total = sc.nextInt();
		
		for (int i = 0; i < total; i++) {
			System.out.printf("Locatario #%d:\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine(); //quebra de linha do input anterior
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			quartos[quarto] = new Persionato(email,nome);
		}
		
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null)
				System.out.println(i + ": " + quartos[i]);
		}
		
		sc.close();
	}

}

package problems;

import java.util.Scanner;

public class E1010 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code, quantidade;
		double valor, total = 0.0;
		
		for (int i=0; i<=1;i++) {
			code = sc.nextInt(); 
			quantidade = sc.nextInt();
			valor = sc.nextDouble();
			total += quantidade*valor;
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		sc.close();
	}

}

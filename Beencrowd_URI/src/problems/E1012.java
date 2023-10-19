package problems;
import java.util.Scanner;

/*
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class E1012 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, T, CL, TP, Q, R;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		T = A*C/2;
		CL = 3.14159*Math.pow(C, 2);
		TP = (A+B)*C/2;
		Q = Math.pow(B, 2);
		R =  A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", T);
		System.out.printf("CIRCULO: %.3f\n", CL);
		System.out.printf("TRAPEZIO: %.3f\n", TP);
		System.out.printf("QUADRADO: %.3f\n", Q);
		System.out.printf("RETANGULO: %.3f\n", R);
		
		sc.close();
		
	}

}

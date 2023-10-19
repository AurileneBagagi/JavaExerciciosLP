package problems;
import java.util.Scanner;

public class E1010 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pc1, pc2, qt1, qt2;
		double v1,v2;
		
		pc1 = sc.nextInt(); 
		qt1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		pc2 = sc.nextInt(); 
		qt2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", qt1*v1 + qt2*v2);
		
		sc.close();
	}

}

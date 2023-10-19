package problems;

import java.util.Locale;
import java.util.Scanner;

public class E1003 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        double x = 3.14159*Math.pow(sc.nextDouble(),2);
        System.out.printf("A=%.4f\n", x);
		
		sc.close();
	}
}

package problems;
import java.util.Scanner;

public class E1008 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", sc.nextInt(), ( (float) sc.nextInt()*sc.nextFloat()));
		
		sc.close();
	}

}

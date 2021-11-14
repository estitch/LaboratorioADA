package class5;

import java.util.Scanner;

public class Q7multiplicar {

	public static void main(String[] args) {
		// complejidad del algoritmo O(log_2(n))
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=1;i<=n;i=i*2)
			System.out.println(i);
	}

}

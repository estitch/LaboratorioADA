package class5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// complejidad de O(n/2)->podemos despejar 1/2 por lo tanto
		// la complejidad seria de O(n)
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=0;i<n;i=i+2) {
			System.out.println(i);
		}
		
		
	}

}

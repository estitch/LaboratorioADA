package class5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// complejidad de O(sqrt(n))
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=0;i*i<n;i++)
			System.out.println(i);

	}

}

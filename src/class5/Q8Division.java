package class5;

import java.util.Scanner;

public class Q8Division {

	public static void main(String[] args) {
		// complejidad de O(log_2(n))
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=n;i>=1;i=i/2)
			System.out.println(i);

	}

}

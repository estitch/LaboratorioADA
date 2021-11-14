package class5;

import java.util.Scanner;

public class Q10dosBucles {

	public static void main(String[] args) {
		// complejidad lineal O(n)
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
			System.out.println(i);
		for(int j=0;j<n;j++)
			System.out.println(j);
	}

}

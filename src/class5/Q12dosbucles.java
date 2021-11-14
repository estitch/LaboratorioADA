package class5;

import java.util.Scanner;

public class Q12dosbucles {

	public static void main(String[] args) {
		// complejidad del algoritmo es de O(nlog(n))
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
			for(int j=1;j<n;j=j*2)
				System.out.println(j);

	}

}

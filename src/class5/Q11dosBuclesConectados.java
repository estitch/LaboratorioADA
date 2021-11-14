package class5;

import java.util.Scanner;

public class Q11dosBuclesConectados {

	public static void main(String[] args) {
		// complejidad de O(log(n))
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		int p=0;
		for(int i=1;i<n;i=i*2)
			p++;
		for(int j=1;j<p;j=j*2)
			System.out.println(j);
	}

}

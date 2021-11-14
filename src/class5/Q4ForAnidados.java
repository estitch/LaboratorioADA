package class5;

import java.util.Scanner;

public class Q4ForAnidados {

	public static void main(String[] args) {
		// complejidad de O(n2)
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				System.out.println(i+"  "+j+"\n");
	}

}

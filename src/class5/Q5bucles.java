package class5;

import java.util.Scanner;

public class Q5bucles {

	public static void main(String[] args) {
		// la complejidad es de O(n2)
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<i;j++) 
				System.out.println(i+" "+j+"\n");

	}

}

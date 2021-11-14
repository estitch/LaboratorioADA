package class5;

import java.util.Scanner;

public class recorerInversa {
	public static void main(String args[]) {
		//complejidad de O(n)
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un tamaño");
		int n = scan.nextInt();
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
	}

}

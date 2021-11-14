package class5;

import java.util.Scanner;

public class recorrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el tamaño de la lista");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(i+1);
		}
		//tiene complejidad O(n)
	}

}

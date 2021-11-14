import java.util.Scanner;

public class SumTen {

	public static boolean sumTen(int [] arr, int n) {
		//complejidad de O(n2) porque tenemos 2 for embebidos
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j&&arr[i]+arr[j]==10) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el tamaño de la lista: ");
		n = scan.nextInt();
		int [] array = new int [n];
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		boolean caso = sumTen(array, n);
		if(caso==true)
			System.out.println("si hay sumas de 10");
		else
			System.out.println("no hay sumas de 10");
	}

}

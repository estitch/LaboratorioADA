import java.util.Scanner;

public class GreatestNumber {
	public static int foundMax(int[] array, int length) {
		int aux = array[0];
		
		for(int i = 1;i<length;i++) {
			aux=Math.max(aux, array[i]);
		}
		return aux;
	}
	public static void main(String[] args) {
		// Convert from O(n2) to O(n) 
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el tamaño del arreglo: ");
		n = scan.nextInt();
		int arr[]=new int[n];
		System.out.println("ingrese valores en la lista: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		int max = foundMax(arr, n);
		System.out.println("el numero mayor es: "+max);

	}

}

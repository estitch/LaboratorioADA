package class6;

public class Ejercicio1 {
	public static int busquedaBinaria(int n, int[] arr, int buscar) {
		int L=0,R=n-1;
		int mid;
		while(L<=R) {
			mid=L+(R-L)/2;
			if(arr[mid]*arr[mid]==buscar)
				return mid;
			if(arr[mid]*arr[mid]<buscar)
				L=mid+1;
			else
				R=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(busquedaBinaria(lista.length, lista, 16));
		
		
		
		

	}

}

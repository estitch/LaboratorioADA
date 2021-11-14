package class6;

public class Ejercicio2 {
	public static int busquedaBinaria(int n, int[] arr, int buscar) {
		int L=0,R=n-1;
		int mid;
		while(L<=R) {
			mid=L+(R-L)/2;
			if(arr[mid]>=buscar)
				return arr[mid];
			if(arr[mid]<buscar)
				L=mid+1;
			else
				R=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		int [] lista = {2, 3, 5, 6, 8, 10, 12};
		System.out.println(busquedaBinaria(lista.length, lista, x));

	}

}

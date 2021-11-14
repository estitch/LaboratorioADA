package class6;

public class Ejercicio3 {
	public static int busquedaBinaria(int n, int[] arr, int buscar) {
		int L=0,R=n-1;
		int mid, menor=arr[0];
		while(L<=R) {
			mid=L+(R-L)/2;
			if(arr[mid]==buscar)
				return mid;
			if(arr[mid]<buscar)
				L=mid+1;
			else
				R=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista = {4, 5, 6, 8, 10, 2, 3};
		System.out.println(busquedaBinaria(lista.length, lista, 2));
		
		

	}

}

package class6;

public class BusquedaBinaria {
	public static int busquedaBinaria(int n, int[] arr, int buscar) {
		int L=0,R=n-1;
		int mid;
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
		int [] lista = {1, 2, 3, 4, 5};
		System.out.println("se encontro el numero en la posicion: "+busquedaBinaria(lista.length, lista, 3));

	}

}

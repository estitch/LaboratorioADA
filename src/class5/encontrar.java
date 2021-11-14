package class5;

import java.util.Scanner;

public class encontrar {
	public static boolean encontre(String arr, String array ) {
		//complejidad es de O(n*m)
		//n: es la cadena que representa a la aguja que se va buscar
		//m: es la cadena grande(pajar) en la que se va buscar la aguja
		int arr_index=0, array_index=0;
		boolean encontrado = false;
		while(array_index<array.length()) {
			System.out.println("hola");

			if(arr.charAt(arr_index)==(array.charAt(array_index))) {
				encontrado=true;
				while(arr_index<arr.length()) {
					if(arr.charAt(arr_index)!=array.charAt(array_index*arr_index)) {
						encontrado = false;
					}
					break;
				}
				arr_index+=1;
			}
			if(encontrado) {return true;}
			arr_index=0;
			array_index+=1;
		}return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String aguja,cadena;
		System.out.println("ingrese la aguja a buscar: ");
		aguja = scan.next();
		System.out.println("ingrese la cadena larga: ");
		cadena = scan.next();
		System.out.println("cadena encontrada: "+encontre(aguja, cadena));
		
	}

}

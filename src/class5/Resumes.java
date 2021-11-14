package class5;

public class Resumes {
	public static String resume(String[] arr) {
		//complejidad de O(log_2(n))
		//elimina poco a poco los resumenes que tiene por revisar, para luego devolver el mejor
		String eliminate = "top";
		while(arr.length>1) {
			if(eliminate.equals("top")) {
				arr[arr.length]=arr[arr.length/2,arr.length-1];
				eliminate = "bottom";
			}else if(eliminate.equals("bottom")) {
				arr[arr.length]=arr[0, arr.length/2];
				eliminate = "top";
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

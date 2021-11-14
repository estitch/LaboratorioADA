
public class OveryOther {

	public static void overyOther(int[] array) {
		//complejidad de O(n2)
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				for(int j=0; j<array.length;j++) {
					System.out.println(array[i]+array[j]);
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 8};
		for(int i : arr) {
			System.out.println(i+",");
		}
		System.out.println();
		overyOther(arr);

	}

}

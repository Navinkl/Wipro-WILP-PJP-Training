
public class Arrays2 {

	public static void main(String[] args) {
		int[] array = { 9, 1, 7, 9};
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}		
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
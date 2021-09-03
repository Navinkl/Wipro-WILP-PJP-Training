
public class Arrays3 {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 9};
		int no = 96;
	    int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == no) {
				index = i ;
				
				break;
			}
			
		}

		System.out.println(index);
		

	}

}

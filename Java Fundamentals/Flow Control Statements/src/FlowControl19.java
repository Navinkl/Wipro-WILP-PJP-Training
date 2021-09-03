
public class FlowControl19 {

	public static void main(String[] args) {
		int no = 0;
		int i = 0;
		
		while (no != 5) {
			i++;
			
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				no++;
			}
		}

	}

}

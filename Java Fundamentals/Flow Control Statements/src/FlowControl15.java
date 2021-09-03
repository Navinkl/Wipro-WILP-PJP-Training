
public class FlowControl15 {

	public static void main(String[] args) {
		int no = 1234;
		int sum = 0;
		
		while (no != 0) {
			sum += no % 10;
			no /= 10;
		}
		
		System.out.println(sum);

	}

	}




public class FlowControl17 {

	public static void main(String[] args) {
		int no = 1234;
		int reverse = 0;
		while(no != 0) 
		{
		int remainder = no % 10;
		reverse = reverse * 10 + remainder;
		no = no/10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
		}

	}



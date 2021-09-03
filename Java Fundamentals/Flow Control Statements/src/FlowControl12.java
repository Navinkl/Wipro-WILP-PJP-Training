
public class FlowControl12 {

	public static void main(String[] args) {
		int no=7;
		Boolean isPrime = true;
		for (int i = 2; i < no/2+1; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (no == 0 || no == 1) {
			isPrime = false;
		}
		
		if (isPrime) 
			{
			System.out.println(no+" is prime");
			}
		else {
			System.out.println(no+ " is not prime");
		}
	}

	}



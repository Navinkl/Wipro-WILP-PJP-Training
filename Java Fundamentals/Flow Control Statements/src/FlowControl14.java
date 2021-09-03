
public class FlowControl14 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter an integer number");
			System.exit(0);
		}
		int no=Integer.parseInt(args[0]);
		Boolean isPrime = true;
		
		for (int i = 2; i < no/2+1; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (no == 0 || no == 1) {
			System.out.println(no + " is neither prime nor composite");
		}
		
		else if (isPrime) 
			{
			System.out.println(no+" is a prime number");
			}
		else {
			System.out.println(no+ " is not a prime number");
		}

	}

}

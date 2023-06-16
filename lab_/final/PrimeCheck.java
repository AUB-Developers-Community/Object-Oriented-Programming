import java.util.*;

public class PrimeCheck
{
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = scanner.nextInt();
		
		boolean isPrime = true;
		int i = 2;
		while(i <= userInput / 2) {
		    if (userInput % i == 0) {
		        isPrime = false;
		        break;
		    }
		    i++;
		}
		
		if (isPrime) {
		    System.out.print("Number is prime");
		} else {
		    System.out.print("Number is not prime");
		}
	}
}

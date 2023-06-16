import java.util.*;

public class FibonacciSeries
{
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = scanner.nextInt();

		int firstTerm = 0;
		int secondTerm = 1;
		
		while (firstTerm <= num) {
		    System.out.print(firstTerm + " ");
		    
		    int nextTerm = firstTerm + secondTerm;
		    firstTerm = secondTerm;
		    secondTerm = nextTerm;
		}
		
	}
}

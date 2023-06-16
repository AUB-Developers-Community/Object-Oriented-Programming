import java.util.*;
// using gcd
public class LCMwithGCD
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter a num2: ");
		int num2 = scanner.nextInt();
		
		int gcd = 1;
		
		for (int i = 1; i <= num1 && i <= num2; i++) {
		    if (num1 % i == 0 && num2 % i == 0) {
		        gcd = i;
		    }
		}
		
		int LeastCommonMultiple = (num1 * num2) / gcd;
		System.out.println("LCM = "+ LeastCommonMultiple);
		
	}
}

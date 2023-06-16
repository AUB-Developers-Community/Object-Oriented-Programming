import java.util.*;

public class GCD
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter a num2: ");
		int num2 = scanner.nextInt();
		
		num1 = (num1 > 0) ? num1 : -num1;
		num2 = (num2 > 0) ? num2 : -num2;
		
		while (num1 != num2) {
		    if (num1 > num2) {
		        num1 -= num2;
		    } else {
		        num2 -= num1;
		    }
		}

		System.out.println("GCD = "+ num1);
	}
}

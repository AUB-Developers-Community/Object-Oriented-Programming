import java.util.*;

public class LCM
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter a num2: ");
		int num2 = scanner.nextInt();
		
		int LeastCommonMultiple = (num1 > num2) ? num1 : num2;
		
		while(true) {
		    if (LeastCommonMultiple % num1 == 0 && LeastCommonMultiple % num2 == 0) {
		        System.out.println("LCM = "+ LeastCommonMultiple);
		        break;
		    }
		    LeastCommonMultiple++;
		}
		
	}
}


// resource: https://en.wikipedia.org/wiki/Least_common_multiple

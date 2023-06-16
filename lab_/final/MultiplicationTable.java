import java.util.*;

public class MultiplicationTable
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = scanner.nextInt();
		
		int i = 1;
		while (i <= 10) {
		    int result = num * i;
		    System.out.println(num + " * " + i + " = " + result);
		    i++;
		}
		
	}
}

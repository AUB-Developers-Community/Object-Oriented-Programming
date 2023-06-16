import java.util.*;
// number
public class PalindromCheckNumber
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int userInput = scanner.nextInt();
		
		int revNum = 0, remainder, originalNum = userInput;
		
		while(userInput != 0) {
		    remainder = userInput % 10;
		    revNum = revNum * 10 + remainder;
		    userInput /= 10;
		}
		
		if(originalNum == revNum) {
		    System.out.println("palindrome");
		}
        else {
		   System.out.println("not palindrome");
        }
	}
}

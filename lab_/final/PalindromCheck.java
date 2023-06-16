import java.util.*;
// string
public class PalindromCheck
{
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();
		
		String revString = "";
		int strl = userInput.length();
		int i = strl-1;
		
		while(i >= 0) {
		    revString = revString + userInput.charAt(i);
		    i--;
		}
		
		if(userInput.toLowerCase().equals(revString.toLowerCase())) {
		    System.out.println("palindrome");
    } else {
		   System.out.println("not palindrome");
    }
	}
}

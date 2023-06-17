public class LeapYearCheck
{
	public static void main(String[] args) {
	    
	    int year = 1900;
	    
	    boolean isLeapYear = false;
	    
	    if (year % 4 == 0) {
	        if (year % 100 == 0) {
	            if (year % 400 == 0) {
	                isLeapYear = true;
	            } else {
	                isLeapYear = false;
	            }
	        } else {
	            isLeapYear = true;
	        }
	    } else {
	        isLeapYear = false;
	    }
	    
	    
	    
		System.out.println(isLeapYear);
	}
}

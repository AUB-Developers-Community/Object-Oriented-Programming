public class Swap
{
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("Swap= " + x + " " + y);
    }
	public static void main(String[] args) {
	    int a = 6;
	    int b = 9;
	    
	    
		swap(a, b);
	}
}

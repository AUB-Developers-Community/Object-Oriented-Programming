public class ifElse {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        }
        else {
            System.out.println("num1 is less than num2");
        }

        if (num1<10) {
            System.out.println("num1 is less than 10");
        } else if (2 < num1) {
            System.out.println("num1 is greater than 2");
        } else {
            System.out.println("invalid character");
        }
    }
}

package lab_.lab3;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int i= 1;
        long fact = 1;

        while(i <= num)
        {
            fact *= i;
            i++;
        }

        System.out.println("Result= " + fact);
    }
}

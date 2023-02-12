public class Operators {
    public static void Arithmetic() {
        int n1 = 5;
        int n2 = 2;

        int addition = n1 + n2;
        int subtraction = n1 - n2;
        int multiplication = n1 * n2;
        float division = n1 / (float) n2; //(float)n1 / n2;
        int modulus = n1 % n2;
        int increment = n2++;
        int decrement = --n1;

        System.out.println("Addition= " + addition + "\nSubtraction= " + subtraction + "\nMultiplication= " + multiplication + "\nDivision= " + division + "\nModulus= " + modulus + "\nIncrement= " + increment + "\nDecrement= " + decrement);
    }

    public static void main(String[] args) {
        Arithmetic();
        //Assignment();
        //Comparison();
    }

    public static void Assignment() {
        // assignment
        int x = 17;
        System.out.println(x);
        // additional assignment
        x += 2;
        System.out.println(x);
        // subtraction assignment
        x -= 1;
        System.out.println(x);
        // multiplication assignment
        x *= 2;
        System.out.println(x);
        // division assignment
        x /= 2;
        System.out.println(x);
        // percent assignment
        x %= 2;
        System.out.println(x);
        // and assignment
        x &= 2;
        System.out.println(x);
        // or assignment
        x |= 2;
        System.out.println(x);
        //
        x ^= 2;
        System.out.println(x);
        // right shift assignment
        x >>= 3;
        System.out.println(x);
        // left shift assignment
        x <<= 3;
        System.out.println(x);
    }

    public static void Comparison() {
        int a = 6;
        int b = 3;

        if (a == b) {
            System.out.println("a and b are both same");
        }
        else {
            System.out.println("a and b are both not same");
        }

        if (a != b) {
            System.out.println("a and b are both not equal");
        } else {
            System.out.println("a and b are equal");
        }

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is not less than b");
        }

        if (a >= b) {
            System.out.println("a is greater than or equal b");
        } else {
            System.out.println("a is not greater than or equal b");
        }

        if (a <= b) {
            System.out.println("a is less than or equal b");
        } else {
            System.out.println("a is not less than or equal b");
        }
    }
}

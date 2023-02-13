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
        // Arithmetic();
        // Assignment();
        Comparison();
    }

    public static void Assignment() {
        ///// assignment
        int x = 17;
        System.out.println(x); // 17

        //////// additional assignment
        x += 2;
        System.out.println("addition assignment: "+ x); // 19

        /////// subtraction assignment
        x -= 1;
        System.out.println("subtraction assignment: "+ x); // 18

        ////// multiplication assignment
        x *= 2;
        System.out.println("multiplication assignment: "+ x); // 36

        ///// division assignment
        x /= 2;
        System.out.println("division assignment: "+ x); // 18

        ///// modulus assignment
        x %= 2;
        System.out.println("modulus assignment: "+ x); // 0

        ////// and assignment
        x = 15;
        x &= 12;
        /**
         * in binary 1 1 1 1  = 15
         * in binary 0 0 1 1 = 12
         * ----------------------
         * in binary 0 0 1 1 which means 12 in decimal
         */
        System.out.println("bitwise and assignment: " + x); // 12

        ///////// or assignment
        x |= 2;
        /**
         * 1, 2, 4, 8, 16, 32, 64, 128
         * in binary 0 0 1 1 = 12
         * in binary 0 1 0 0 =  2
         * ----------------------
         * in binary 0 1 1 1 which means 14 in decimal
         */
        System.out.println("bitwise or assignment: " + x); // 14

        /////////// xor assignment
        x ^= 5;
        /**
         * [1, 2, 4, 8, 16, 32, 64, 128]
         *
         * in binary 0 1 1 1 = 14
         * in binary 1 0 1 0 =  5
         * ----------------------
         * in binary 1 1 0 1 which means 11 in decimal
         */
        System.out.println("bitwise xor assignment: " + x); // 11

        //////// right shift assignment
        x >>= 1;
        /**
         * 1 1 0 1 0 0 0 0 = 11
         * now shift 1 bit, right to left
         * 1 0 1 0 0 0 0 0 which means 5 in decimal
         */
        System.out.println("right shift assignment: " + x); // 5

        ////////// left shift assignment
        x <<= 1;
        /**
         * 1 0 1 0 0 0 0 0 = 5
         * now shift 1 bit, left to right
         * 0 1 0 1 0 0 0 0 which means 10 in decimal
         */
        System.out.println("left shift assignment: " + x); // 10
    }

    public static void Comparison() {
        int a = 6;
        int b = 3;

        // Equal to operator
        if (a == b) {
            System.out.println("value of a and b are both same");
        }
        else {
            System.out.println("value of a and b are both not same");
        }

        // Not equal to operator
        if (a != b) {
            System.out.println("value of a and b are both not equal");
        } else {
            System.out.println("value of a and b are equal");
        }

        // Greater than operator
        if (a > b) {
            System.out.println("value of a is greater than value of b");
        } else {
            System.out.println("value of b is greater than value of a");
        }

        // Less than operator
        if (a < b) {
            System.out.println("value of a is less than value of b");
        } else {
            System.out.println("value of b is less than value of a");
        }

        // Greater than or equal operator
        if (a >= b) {
            System.out.println("value of a is greater than or equal to value of b");
        } else {
            System.out.println("value of b is greater than or equal to value of a");
        }

        // Less than or equal operator
        if (a <= b) {
            System.out.println("value of a is less than or equal to value of b");
        } else {
            System.out.println("value of b is less than or equal to value of a");
        }
    }
}

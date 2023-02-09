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
    }
}

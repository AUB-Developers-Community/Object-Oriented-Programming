public class SumOfNaturalNumbers {
    public static int recursiveSummation(int number) {
        if (number <= 1) {
            return number;
        }
        return number + recursiveSummation(number - 1);
    }

    public static void main(String[] args) {
        int result = recursiveSummation(5);
        int result2 = recursiveSummation(10);

        System.out.println(result);
        System.out.println(result2);
    }
}
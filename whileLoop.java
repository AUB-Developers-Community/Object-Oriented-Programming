public class whileLoop {
    public static void main(String[] args) {
        int count =0;

        while (true) {
            System.out.println(count);
            if (count == 10) {
                break;
            }
            count++;
        }
    }
}

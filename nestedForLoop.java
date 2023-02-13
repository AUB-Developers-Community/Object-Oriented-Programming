public class nestedForLoop {
    public static void main(String[] args) {
        int limit = 5;

        for (int i=0; i<limit; i++) {
            for (int j=i+1; j<limit; j++) {
                System.out.println("i= " + i + "\t" + "j= " + j);
            }
        }
    }
}

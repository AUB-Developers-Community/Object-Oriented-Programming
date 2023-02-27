package book;

import java.util.Date;
import java.util.Random;

public class JavaLibrary {

    public static void dateClass()  {
        Date date = new Date();
        System.out.println(date.getTime()); // time in milliseconds
        System.out.println(date.toString());
    }

    public static void randomClass() {
        Random random = new Random();
        for (int i=0; i<10; i++) {
            System.out.print(random.nextInt(1000) + " ");
        }
    }
    public static void main(String[] args) {
        dateClass();

        randomClass();
    }
}

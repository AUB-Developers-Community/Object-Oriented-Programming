package book;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

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

    public static void point2dClass() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x1 and y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter value of x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point((int)x1, (int)y1);
        Point2D p2 = new Point((int) x2, (int) y2);

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());

        System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
    }
    public static void main(String[] args) {
        dateClass();

        //randomClass();

        point2dClass();
    }
}

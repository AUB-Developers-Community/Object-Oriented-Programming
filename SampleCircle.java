public class SampleCircle {
    public static void main(String[] args) {
        // Create a circle with radius 1(default)
        FirstCircle circle1 = new FirstCircle();
        System.out.println("The area of the circle1 of radius " + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 15
        FirstCircle circle2 = new FirstCircle(15);
        System.out.println("The area of the circle2 of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 142
        FirstCircle circle3 = new FirstCircle(142);
        System.out.println("The area of the circle3 of radius " + circle3.radius + " is " + circle3.getArea());

        //Modify circle radius
        circle2.setRadius(55);
        System.out.println("The area of the circle2 of radius " + circle2.radius + " is " + circle2.getArea());

    }
}

class FirstCircle {
    double radius = 1;

    public FirstCircle() {
        //
    }

    public FirstCircle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
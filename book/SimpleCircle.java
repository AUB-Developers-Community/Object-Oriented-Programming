package book;

public class SimpleCircle {
    private double radius = 1;

    public SimpleCircle() {
        //
    }

    public SimpleCircle(double newRadius) {
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

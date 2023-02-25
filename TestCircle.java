import book.SimpleCircle;

public class TestCircle {
    public static void main(String[] args) {
        SimpleCircle myobj = new SimpleCircle();

        myobj.setRadius(.7D);
        System.out.println("area: "+myobj.getArea());

        SimpleCircle obj_second = new SimpleCircle(2.37d);
        System.out.println("perimeter:" + obj_second.getPerimeter());
    }
}


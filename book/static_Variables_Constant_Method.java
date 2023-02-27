package book;

public class static_Variables_Constant_Method {
    static int floor_num = 4;
    int f_num = 5;

    public static int StaticMethod() {
        return floor_num;
    }
    public static void staticVariables() {
//        System.out.println("f_num: " + f_num); // generate error or impossible to access f_num(non-static variable)
        System.out.println("floor_num: " + floor_num);
    }
    public static void main(String[] args) {
        staticVariables();

        System.out.println(StaticMethod());
    }
}

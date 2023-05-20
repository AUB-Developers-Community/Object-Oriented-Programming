package lab_.lab2;

public class Question3 {
    private int id;
    private String name;

    public Question3(int userId, String userName) {
        this.id = userId;
        this.name = userName;
    }

    void Display() {
        System.out.println("Id= " + this.id);
        System.out.println("Name= " + this.name);
    }

    public static void main(String[] args) {
        System.out.println("Object 1 Constructor");
        Question3 obj1 = new Question3(101, "John Doe");
        obj1.Display();

        System.out.println("Object 2 Constructor");
        Question3 obj2 = new Question3(102, "Mike Gilbert");
        obj2.Display();
    }
}

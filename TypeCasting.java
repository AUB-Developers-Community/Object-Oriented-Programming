public class TypeCasting {
  private static void WideningCasting() {
    // converting a smaller type to a larger type size
    int intVar = 4;
    double doubleVar = intVar;
    
    System.out.println(doubleVar);
  }
  private static void NarrowingCasting() {
    //  converting a larger type to a smaller size type
    double doubleVar = 4.76d;
    int intVar = (int) doubleVar;
    
    System.out.println(intVar);
  }
  
  public static void main(String[] args) {
    /**
      * Type casting is when you assign a value of one primitive data type to another type. there are two types of casting:
      * 1. Widening Casting
      * 2. Narrowing Casting
    */
    WideningCasting();
    NarrowingCasting();
  }
}

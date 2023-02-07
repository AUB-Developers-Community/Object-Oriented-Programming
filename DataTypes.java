public class DataTypes {
  private static void PrimitiveDataTypes() {
    // There are eight primitive data types in Java:
    byte byt = 100;
    short sht = 234;
    int year = 2023;
    long average = 543324L;
    float radius = 2.93f;
    double accuracy = 3.13051d;
    boolean isMale = true;
    char chr = 'L';
    // with ASCII
    char myVar = 65; // 65 = A
    
    System.out.println(byt + "\n" + sht + "\n" + year + "\n" + average + "\n" + radius + "\n" + accuracy + "\n" + isMale + "\n" + chr + "\n" + myVar);
  }
  
  private static void NonPrimitiveDataTypes() {
    // Non-Primitive Data Types or, reference types
    // 1. String
    // 2. Array
    // 3. Classes
    // 4. Interface.. etc.
    String name = "Md. Zahangir Alam";
  }
  
  public static void main(String[] args) {
    PrimitiveDataTypes();
  }
}

/*
 * @Lab: 
 * @Zahangir
 
 * @Question: Write a program to create a class Student2 along with two method getData(),printData() to get the value through argument and
              display the data in printData. Create the two objects s1 ,s2 to declare and access the values from class STtest.
*/
package lab_;

public class Student2 {
  private int myNum;
  
  public int getData(int userNum) {
    return userNum;
  }
  public void printData() {
    System.out.println(getData(myNum));
  }
}

class STest {
    public static void main(String[] args) {
      Student2 s1 = new Student2();
    //   s1.myNum = 5;
    //   s1.printData();
      int myNum = 5;
      s1.printData();
    }
  
  Student2 s2 = new Student2();
}

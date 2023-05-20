/*
 * Lab 2: May 8, 2023
 * Question: Write a program to create a class Student with data ‘name, city and age’ along with method printData to display the data. 
             Create the two objects s1 ,s2 to declare and access the values.
@Zahangir
*/
package lab_.lab2;

public class Student
{
    private String name;
    private String city;
    private int age;
    
    public void printData() {
        System.out.println("Name: "+ name);
        System.out.println("City: "+ city);
        System.out.println("Age: "+ age);
    }
    
	public static void main(String[] args) {
	    /* s1 object */
	    System.out.println("Result of s1 object");
	    Student s1 = new Student();

		// declare values
	    s1.name = "POTUS";
	    s1.city = "Texas";
	    s1.age = 45;
	    s1.printData();
	    
	    System.out.println("-----\nAccessing values");
		// access values
	    System.out.println(s1.name);
	    System.out.println(s1.city);
	    System.out.println(s1.age);
	    
	    /////////////////////////////
	    /* s2 object */
	    System.out.println("\nResult of s2 object");
		// create object
	    Student s2 = new Student();
	    s2.name = "Karoline";
	    s2.city = "New York";
	    s2.age = 39;
		// access method
	    s2.printData();
	    
	    System.out.println("-----\nAccessing values");
		// access values
	    System.out.println(s2.name);
	    System.out.println(s2.city);
	    System.out.println(s2.age);
	}
}


/*
*** Expected output:
********************
Result of s1 object
Name: POTUS
City: Texas
Age: 45
-----
Accessing values
POTUS
Texas
45

Result of s1 object
Name: Karoline
City: New York
Age: 39
-----
Accessing values
Karoline
New York
39
********************
*/

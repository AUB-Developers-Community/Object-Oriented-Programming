public class jString {
    public static void main(String[] args) {
        String greetings = "Hello, Everyone! Welcome to the Community";
        System.out.println(greetings);

        // Length
        int stringLength = greetings.length();
        System.out.println("Length of the \"greetings\" string is: "+stringLength);

        // toUpperCase
        String convertToUpperCase = greetings.toUpperCase();
        System.out.println(convertToUpperCase);

        // toLowerCase
        String convertToLowerCase = greetings.toLowerCase();
        System.out.println(convertToLowerCase);

        // find position of a string/character
        String searchingString = "to";
        int position = greetings.indexOf(searchingString);
        System.out.println(position);

        // Concatenation
        concatenation();
    }

    public static void concatenation() {
        String fName = "Mike";
        String sName = "Frasw";

        System.out.println(fName + " " + sName);
    }
}

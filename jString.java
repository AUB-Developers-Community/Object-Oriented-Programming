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

        // Escape Characters
        EscapeCharacters();
    }

    public static void concatenation() {
        String fName = "Mike";
        String sName = "Frasw";

        System.out.println(fName + " " + sName);
    }

    public static void EscapeCharacters() {
        String newLinetext = "Hello\nworld!";
        System.out.println("New line: " + newLinetext);

        String CarriageReturn = "Hello\rWorld!";
        System.out.println("Carriage Return: "+CarriageReturn);

        String Tabtext = "Hello\tworld!";
        System.out.println("Tab: " + Tabtext);

        String backspacetext = "Hello\bworld!";
        System.out.println("Backspace: " + backspacetext);

        String formFeed = "Hello\fForm";
        System.out.println("Form Feed: "+formFeed);
    }
}


public class StringDemo {
    public static void main(String[] args) {
        // String Constructors
        String s1 = new String(); // Empty string
        String s2 = new String("Hello"); // From literal
        char[] ch = { 'J', 'a', 'v', 'a' };
        String s3 = new String(ch); // From char array
        byte[] b = { 65, 66, 67, 68 };
        String s4 = new String(b); // From byte array

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);

        // Commonly used String methods
        String str = "Java Programming";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(5));
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace: " + str.replace("Java", "Python"));
        System.out.println("Index of 'g': " + str.indexOf('g'));

        // Demonstrating String immutability
        String s = "Hello";
        s.concat(" World");
        System.out.println("String after concat: " + s);
        // StringBuffer example
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb);
        // StringBuilder example
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        System.out.println("StringBuilder: " + sbuilder);
    }
}
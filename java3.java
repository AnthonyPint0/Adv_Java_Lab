public class java3 {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("Java");
        char[] letters = {'C', 'o', 'd', 'e'};
        String s3 = new String(letters);

        System.out.println("s1: '" + s1 + "'");
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        String text = "java programming";
        System.out.println("Length: " + text.length());
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Substring: " + text.substring(5));

        String str = "Hi";
        str.concat(" All");
        System.out.println("String (immutable): " + str);

        StringBuffer sb = new StringBuffer("Hi");
        sb.append(" All");
        System.out.println("StringBuffer (mutable): " + sb);

        StringBuilder sbd = new StringBuilder("Hi");
        sbd.append(" All");
        System.out.println("StringBuilder (mutable): " + sbd);
    }
}

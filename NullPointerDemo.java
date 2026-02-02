public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String str = null; // deliberately null
            System.out.println(str.length()); // causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Object is null.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}

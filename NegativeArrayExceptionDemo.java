public class NegativeArrayExceptionDemo {
    public static void main(String[] args) {
        try {
            int size = -5; // deliberately invalid
            int[] arr = new int[size]; // causes exception
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception caught: Array size cannot be negative.");
        }
    }
}

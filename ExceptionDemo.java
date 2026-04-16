public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int arr[] = { 1, 2, 3 };
        try {
            // Arithmetic Exception
            int result = a / b;
            System.out.println("Result: " + result);
            // Array Index Exception
            System.out.println(arr[5]);
        }
        // Multiple catch blocks
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred: " + e);
        } catch (Exception e) {
            System.out.println("General Exception occurred: " + e);
        }
        // finally block
        finally {
            System.out.println("Finally block always executes.");
        }
        System.out.println("Program continues...");
    }
}

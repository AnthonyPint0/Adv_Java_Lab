public class java5 {
    public static void main(String[] args) {
        String text = "abc";

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);

            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }

        System.out.println("Program ended.");
    }
}

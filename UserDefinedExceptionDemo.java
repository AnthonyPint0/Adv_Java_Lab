// User-defined exception class
class InvalidAgeException extends Exception {
    // Constructor
    InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    // Method using throws keyword
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // using throw keyword
            throw new InvalidAgeException("Age is below 18. Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // calling method
        }
        // catching exception using Throwable class
        catch (Throwable t) {
            System.out.println("Exception caught: " + t.getMessage());
        }
        System.out.println("Program continues...");
    }
}

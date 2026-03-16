class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class java6 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Throwable t) {
            System.out.println("Caught using Throwable: " + t.getMessage());
        }

        System.out.println("Program continues.");
    }
}

// User-defined exception
class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String message) {
        super(message);
    }
}

public class PayCheckDemo {

    // Method that throws the custom exception
    static void checkPay(double pay) throws PayOutOfBoundsException {
        if (pay < 0 || pay > 100000) {
            throw new PayOutOfBoundsException("Pay amount is out of allowed range");
        }
        System.out.println("Pay accepted: " + pay);
    }

    public static void main(String[] args) {
        try {
            checkPay(150000); // deliberately invalid
        } catch (PayOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

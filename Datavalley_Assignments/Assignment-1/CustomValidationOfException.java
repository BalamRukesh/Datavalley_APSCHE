public class CustomValidationOfException{

    public static class CustomValidationException extends Exception {
        public CustomValidationException(String message) {
            super(message);
        }
    }

    public static void validateNumber(int num) throws CustomValidationException {
        if (num < 0) {
            throw new CustomValidationException("Number cannot be negative.");
        } else {
            System.out.println("Number is valid.");
        }
    }

    public static void main(String[] args) {
        int inputNumber = -5; // Renamed 'number' to 'inputNumber'
        try {
            validateNumber(inputNumber);
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

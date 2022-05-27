import javax.swing.*;

public class ISBNValidator {
    public static void main(String[] args) {
        String userNumber = JOptionPane.showInputDialog("Please enter the ISBN number you wish to validate without " +
                "any symbols. E.g. '9780316066525'.").toLowerCase();

        giveISBNOutput(userNumber);
    }

    private static void giveISBNOutput(String userNumber) {
        userNumber = checkForX(userNumber);

        if (userNumber.length() == 10) {
            if (check10DigitISBN(userNumber).equalsIgnoreCase("valid")) {
                System.out.println(ISBN10Converter(userNumber));
            } else {
                System.out.println("Invalid");
            }
        } else if (userNumber.length() == 13) {
            System.out.println(check13DigitISBN(userNumber));
        } else {
            System.out.println("Invalid");
        }
    }

    public static String checkForX(String originalNumber) {
        if (originalNumber.contains("x")) {
            originalNumber = originalNumber.replace("x", "10");
        }
        return originalNumber;
    }

    public static String check10DigitISBN(String number) {
        int sum = 0;

        if (number.length() < 10) {
            return "Invalid";
        }

        for (int i = 0; i < number.length(); i++) {
            int numberAsInt = Integer.parseInt(number.substring(i, i+1));
            int checkNumber = 10 - i;
            int multiply = numberAsInt * checkNumber;
            sum += multiply;
        }

        if (sum % 11 == 0) {
            return "Valid";
        }
        return "Invalid";
    }

    public static String check13DigitISBN(String number) {
        int sum = 0;

        if (number.length() != 13) {
            return "Invalid";
        }

        for (int i = 0; i < number.length(); i++) {
            int numberAsInt = Integer.parseInt(number.substring(i, i+1));
            if (i % 2 == 1) {
                sum += 3 * numberAsInt;
            } else {
                sum += numberAsInt;
            }
        }

        if (sum % 10 == 0) {
            return "Valid";
        }
        return "Invalid";
    }

    public static String ISBN10Converter(String number) {
        String newISBN13 = "978" + number.substring(0, number.length() - 1);
        int sum = 0;
        int multiply;

        for (int i = 0; i < newISBN13.length(); i++) {
            if (i % 2 == 0) {
                multiply = 1;
            } else {
                multiply = 3;
            }
            // This is an adaption from the link given at the end
            sum += (Integer.parseInt("" + newISBN13.charAt(i))) * multiply;
        }
        sum = 10 - (sum % 10);
        newISBN13 += sum;

        return newISBN13;
    }
}

// Link to a post that I used to help me figure out how to get the last digit.
// https://stackoverflow.com/questions/17108621/converting-isbn10-to-isbn13
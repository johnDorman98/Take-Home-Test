import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISBNValidatorTest {

    @Test
    public void userInputShouldStaySame() {
        Assertions.assertEquals("9780316066525", ISBNValidator.checkForX("9780316066525"));
    }

    @Test
    public void userInputShouldBeValid() {
        Assertions.assertEquals("Valid", ISBNValidator.check13DigitISBN("9780316066525"));
    }

    @Test
    public void userInputShouldReturnNewNumber() {
        Assertions.assertEquals("9780316066525", ISBNValidator.ISBN10Converter("0316066524"));
    }

    @Test
    public void userInputShouldReturnInvalid() {
        Assertions.assertEquals("Invalid", ISBNValidator.check10DigitISBN("0330301824"));
    }
}
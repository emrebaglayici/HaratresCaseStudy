package SecondQuestion;

import Exceptions.InvalidConstraintException;
import SecondQuestion.CloseNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CloseNumbersTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenArraySizeEqualsOne() {
        CloseNumbers closeNumbers = new CloseNumbers();
        Integer[] numbers = new Integer[1];
        assertThrows(InvalidConstraintException.class, () -> closeNumbers.checkArraySize(numbers));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenArraySizeEquals1000() {
        CloseNumbers closeNumbers = new CloseNumbers();
        Integer[] numbers = new Integer[1000];
        assertThrows(InvalidConstraintException.class, () -> closeNumbers.checkArraySize(numbers));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenOneOfArrayElementMinus20000() {
        CloseNumbers closeNumbers = new CloseNumbers();
        Integer[] numbers = {-20000, 1, 5, 23, 2, 4, 9, 10, 15, 31};
        assertThrows(InvalidConstraintException.class, () -> closeNumbers.checkNumbers(numbers));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenOneOfArrayElement20000() {
        CloseNumbers closeNumbers = new CloseNumbers();
        Integer[] numbers = {20000, 1, 5, 23, 2, 4, 9, 10, 15, 31};
        assertThrows(InvalidConstraintException.class, () -> closeNumbers.checkNumbers(numbers));
    }

    @Test
    void printResult() {
        CloseNumbers closeNumbers = new CloseNumbers();
        String[] result = {"1 2", "2 3", "3 4", "4 5", "9 10"};
        closeNumbers.printResult(result);
        assertEquals("1 2\n2 3\n3 4\n4 5\n9 10\n", outputStreamCaptor.toString().replace("\r", ""));
    }

    @Test
    void findCloseNumbers() throws InvalidConstraintException {
        CloseNumbers closeNumbers = new CloseNumbers();
        Integer[] numbers = {3, 1, 5, 23, 2, 4, 9, 10, 15, 31};
        String[] result = {"1 2", "2 3", "3 4", "4 5", "9 10"};
        String[] a = Arrays.stream(closeNumbers.findCloseNumbers(numbers)).filter(Objects::nonNull).toArray(String[]::new);
        assertEquals(Arrays.toString(result), Arrays.toString(a));
    }
}

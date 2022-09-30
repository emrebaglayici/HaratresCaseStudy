package ThirdQuestion;

import Exceptions.InvalidConstraintException;
import ThirdQuestion.Basket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BasketTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenArraySizeEqualsOne() {
        Basket basket = new Basket();
        Integer[] products = new Integer[1];
        assertThrows(InvalidConstraintException.class, () -> basket.checkArraySize(products));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenArraySize2000() {
        Basket basket = new Basket();
        Integer[] products = new Integer[100];
        assertThrows(InvalidConstraintException.class, () -> basket.checkArraySize(products));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenOneOfArrayElementEquals0() {
        Basket basket = new Basket();
        Integer[] products = {0};
        assertThrows(InvalidConstraintException.class,()-> basket.checkElementInArray(products));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenOneOfArrayElementEquals2000(){
        Basket basket = new Basket();
        Integer[] products = {2000};
        assertThrows(InvalidConstraintException.class,()-> basket.checkElementInArray(products));
    }

    @Test
    void calculateBasket() throws InvalidConstraintException {
        Basket basket=new Basket();
        Integer[] products={5, 6, 4, 3, 4};
        String result="Total : 15\n" +
                "3 4 5 ";
        basket.calculateBasket(products);
        assertEquals(result,outputStreamCaptor.toString().replace("\r",""));
    }

}

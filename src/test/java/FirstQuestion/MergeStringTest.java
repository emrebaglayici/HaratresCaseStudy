package FirstQuestion;

import Exceptions.InvalidConstraintException;
import FirstQuestion.MergeStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MergeStringTest {

    @Test
    void shouldReturnInvalidConstraintExceptionWhenAnyStringSizeEquals1() {
        MergeStrings mergeStr = new MergeStrings();
        assertThrows(InvalidConstraintException.class, () -> mergeStr.mergeStrings("a", "a"));
    }

    @Test
    void shouldReturnInvalidConstraintExceptionWhenAnyStringSizeGraterThan2500() {
        MergeStrings mergeStr = new MergeStrings();
        String invalidString = "a";
        assertThrows(InvalidConstraintException.class, () -> mergeStr.mergeStrings(invalidString.repeat(2500), "a"));
    }

    @Test
    void mergeStrings() throws InvalidConstraintException {
        MergeStrings mergeStrings = new MergeStrings();
        assertEquals("haratres", mergeStrings.mergeStrings("hrte", "aars"));
    }
}

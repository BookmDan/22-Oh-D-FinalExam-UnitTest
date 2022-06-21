//StringCalculator.add("-1,5")     -> exception
//StringCalculator.add("1,1000")   -> 1

package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalcTest {
    @Test
    void testForNeg() {
        fail("Not yet implemented");
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {

        });
        Assertions.assertEquals("negatives not allowed", exception.getMessage());
        assertThat(StringCalculator.add("-1,5"), is(equalTo(exception.getMessage())));
    }

    @Test
    void testforMax() {
        fail("Not yet implemented");
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {

        });
        Assertions.assertEquals("numbers greater than 1000 should be ignored", exception.getMessage());
        assertThat(StringCalculator.add("1,1000"), is(equalTo(1)));
    }
}

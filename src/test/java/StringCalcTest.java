//StringCalculator.add("-1,5")     -> exception
//StringCalculator.add("1,1000")   -> 1

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalcTest {
    @Test
    void testForNeg() {
        fail("Not yet implemented");
        Exception thrown = assertThrows(Exception.class, () -> {

        });
        assertEquals("negatives not allowed", thrown.getMessage());
        assertThat(StringCalculator.add("-1,5"), is(equalTo(thrown.getMessage())));
    }

    @Test
    void testforMax() {
        fail("Not yet implemented");
        Exception thrown = assertThrows(Exception.class, () -> {

        });
        assertEquals("numbers greater than 1000 should be ignored", thrown.getMessage());
        assertThat(StringCalculator.add("1,1000"), is(equalTo(1)));
    }
}

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {

    @Test
    public void testTwo() {
        assertEquals(List.of(2), PrimeFactor.generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(List.of(3), PrimeFactor.generate(3));
    }

    @Test
    public void testFour() {
        assertEquals(List.of(2, 2), PrimeFactor.generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(List.of(2, 3), PrimeFactor.generate(6));
    }

    @Test
    public void testNine() {
        assertEquals(List.of(3, 3), PrimeFactor.generate(9));
    }

    @Test
    public void testTwelve() {
        assertEquals(List.of(2, 2, 3), PrimeFactor.generate(12));
    }
}

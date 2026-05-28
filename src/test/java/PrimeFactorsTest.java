import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    @Test
    public void testTwo() {
        assertEquals(List.of(2), PrimeFactor.generate(2));
    }
}

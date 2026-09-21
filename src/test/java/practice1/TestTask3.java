package practice1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice1.Task3.getLessNumber;

public class TestTask3 {
    @Test
    public void testF() {
        assertEquals(1, getLessNumber(5, 10));
        assertEquals(2, getLessNumber(500, 10));
        assertEquals(1, getLessNumber(10, 10));
    }
}

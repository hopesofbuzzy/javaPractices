package practice1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static practice1.Task2.f;

public class TestTask2 {
    @Test
    public void testF() {
        assertEquals(55.0, f(5));
        assertEquals(-55.0, f(0));
        assertEquals(-93.0, f(1));
    }
}

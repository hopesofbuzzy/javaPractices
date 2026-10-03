package practice2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice2.Task4.dist;

public class Task4Test {
    @Test
    public void testF() {
        assertEquals(Math.sqrt(3), dist(0, 0, 0, 1, 1, 1));
        assertEquals(Math.sqrt(2), dist(0, 0, 0, 1, 1, 0));
    }
}

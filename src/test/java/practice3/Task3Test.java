package practice3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static practice3.Task3.getToK;

public class Task3Test {
    @Test
    public void testGetToK() {
        assertEquals(6, getToK(new int[] {1, 2, 3, 532}, 3));
        assertEquals(62, getToK(new int[] {50, 12, 90, 532, 5123}, 2));
        assertEquals(16, getToK(new int[] {5, 4, 6, 1}, 4));
    }
}

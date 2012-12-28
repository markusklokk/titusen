package markus.titusen;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MathTest {
    @Test
    public void testAdd() throws Exception {
        int a = 4;
        int b = 7;
        int expected = 11;
        int actual = Math.add(a, b);
        assertEquals(expected, actual);
    }
}

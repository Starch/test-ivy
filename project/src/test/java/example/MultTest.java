package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultTest {

    @Test
    public void mult() throws Exception {
        assertEquals(10, new Mult(5).mult(2));
    }

}

package kata01DuplicateEncoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Alenka on 08.08.2016.
 */
public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
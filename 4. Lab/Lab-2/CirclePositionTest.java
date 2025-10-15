import org.junit.Test;
import static org.junit.Assert.*;

public class CirclePositionTest {
    @Test
    public void testDiLuar() {
        // r1 + r2 < jarak
        assertEquals(CirclePosition.DI_LUAR, CirclePosition.getPosition(5, 2, 10, 0));
    }

    @Test
    public void testDiDalam() {
        // r2 + jarak < r1
        assertEquals(CirclePosition.DI_DALAM, CirclePosition.getPosition(10, 2, 1, 1));
    }

    @Test
    public void testBeririsan() {
        // else (not di luar, not di dalam)
        assertEquals(CirclePosition.BERIRISAN, CirclePosition.getPosition(5, 3, 5, 0));
        assertEquals(CirclePosition.BERIRISAN, CirclePosition.getPosition(5, 3, 2, 2));
    }

    @Test
    public void testEdgeCases() {
        // r1 + r2 == jarak
        assertEquals(CirclePosition.BERIRISAN, CirclePosition.getPosition(5, 5, 10, 0));
        // r2 + jarak == r1
        assertEquals(CirclePosition.BERIRISAN, CirclePosition.getPosition(5, 2, 3, 0));
    }
}

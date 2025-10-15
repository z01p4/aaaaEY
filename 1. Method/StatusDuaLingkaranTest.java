import org.junit.Test;
import static org.junit.Assert.*;

public class StatusDuaLingkaranTest {
    @Test
    public void testDiLuar() {
        // r1 + r2 < jarak
        assertEquals(StatusDuaLingkaran.DI_LUAR, StatusDuaLingkaran.statusDuaLingkaran(5, 2, 10, 0));
    }

    @Test
    public void testDiDalam() {
        // r2 + jarak < r1
        assertEquals(StatusDuaLingkaran.DI_DALAM, StatusDuaLingkaran.statusDuaLingkaran(10, 2, 1, 1));
    }

    @Test
    public void testBeririsan() {
        // else (not di luar, not di dalam)
        assertEquals(StatusDuaLingkaran.BERIRISAN, StatusDuaLingkaran.statusDuaLingkaran(5, 3, 5, 0));
        assertEquals(StatusDuaLingkaran.BERIRISAN, StatusDuaLingkaran.statusDuaLingkaran(5, 3, 2, 2));
    }

    @Test
    public void testEdgeCases() {
        // r1 + r2 == jarak
        assertEquals(StatusDuaLingkaran.BERIRISAN, StatusDuaLingkaran.statusDuaLingkaran(5, 5, 10, 0));
        // r2 + jarak == r1
        assertEquals(StatusDuaLingkaran.BERIRISAN, StatusDuaLingkaran.statusDuaLingkaran(5, 2, 3, 0));
    }
}

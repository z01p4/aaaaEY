import static org.junit.Assert.*;
import org.junit.Test;

public class TowerOfHanoiTest {

    @Test
    public void testUkuran1() {
        assertEquals(1, TowerOfHanoi.hitungLangkah(1));
    }

    @Test
    public void testUkuran3() {
        assertEquals(7, TowerOfHanoi.hitungLangkah(3));
    }

    @Test
    public void testUkuran4() {
        assertEquals(15, TowerOfHanoi.hitungLangkah(4));
    }

    @Test
    public void testUkuran5() {
        assertEquals(31, TowerOfHanoi.hitungLangkah(5));
    }
}


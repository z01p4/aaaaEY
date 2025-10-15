import static org.junit.Assert.*;
import org.junit.Test;

public class JumlahFaktorPrimaTest {

    @Test
    public void testBilangan35() {
        assertEquals(12, JumlahFaktorPrima.hitungJumlahFaktorPrima(35));
    }

    @Test
    public void testBilangan121() {
        assertEquals(11, JumlahFaktorPrima.hitungJumlahFaktorPrima(121));
    }

    @Test
    public void testBilangan100() {
        assertEquals(7, JumlahFaktorPrima.hitungJumlahFaktorPrima(100));
    }

    @Test
    public void testBilangan30() {
        assertEquals(10, JumlahFaktorPrima.hitungJumlahFaktorPrima(30));
    }
}


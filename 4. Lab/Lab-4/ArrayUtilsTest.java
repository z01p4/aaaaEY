// ===== ArrayUtilsTest.java =====
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void contohSoal() {
        int actual = ArrayUtils.jumlahArrayGanjil(new int[]{1, 2, 3, 4, 5});
        assertEquals(9, actual);
    }

    @Test
    public void semuaGenapHasilNol() {
        int actual = ArrayUtils.jumlahArrayGanjil(new int[]{2, 4, 6, 8});
        assertEquals(0, actual);
    }

    @Test
    public void adaNegatifGanjilIkutDijumlah() {
        int actual = ArrayUtils.jumlahArrayGanjil(new int[]{-5, -4, -3, 0, 7});
        assertEquals(-1, actual); // -5 + (-3) + 7 = -1
    }

    @Test
    public void arrayKosongNol() {
        int actual = ArrayUtils.jumlahArrayGanjil(new int[]{});
        assertEquals(0, actual);
    }

    @Test
    public void nullNol() {
        int actual = ArrayUtils.jumlahArrayGanjil(null);
        assertEquals(0, actual);
    }
}


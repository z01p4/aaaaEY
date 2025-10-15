// ===== EditArrayTest.java =====
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class EditArrayTest {

    @Test
    public void edit_di_tengah() {
        int[] data = {10, 20, 30, 40};
        int[] expected = {10, 99, 30, 40};

        assertArrayEquals(expected, EditArray.editArray(data, 1, 99));
        // pastikan array lama tidak berubah
        assertArrayEquals(new int[]{10, 20, 30, 40}, data);
    }

    @Test
    public void edit_elemen_pertama_dan_terakhir() {
        int[] data = {1, 2, 3};
        assertArrayEquals(new int[]{9, 2, 3}, EditArray.editArray(data, 0, 9));
        assertArrayEquals(new int[]{1, 2, 8}, EditArray.editArray(data, 2, 8));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void index_negatif_throw() {
        EditArray.editArray(new int[]{1, 2, 3}, -1, 7);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void index_di_luar_throw() {
        EditArray.editArray(new int[]{1, 2, 3}, 3, 7);
    }

    @Test(expected = NullPointerException.class)
    public void data_null_throw() {
        EditArray.editArray(null, 0, 1);
    }
}

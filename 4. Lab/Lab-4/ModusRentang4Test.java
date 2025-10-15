import static org.junit.Assert.*;
import org.junit.Test;

public class ModusRentang4Test {

    @Test
    public void modus01() {
        int[] data = {0, 1, 2, 2, 3, 3, 3, 4, 4};
        assertArrayEquals(new int[]{3}, ModusRentang4.modusRentang4(data));
    }

    @Test
    public void modus02() {
        int[] data = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4};
        assertArrayEquals(new int[]{1}, ModusRentang4.modusRentang4(data));
    }

    @Test
    public void modus03() {
        int[] data = {0, 1, 1, 1, 1, -1, 2, 2, 3, 3, 3, 4, 4};
        assertArrayEquals(new int[]{}, ModusRentang4.modusRentang4(data));
    }

    @Test
    public void modus04() {
        int[] data = {0, 1, 1, 1, 1, 5, 2, 2, 3, 3, 3, 4, 4};
        assertArrayEquals(new int[]{}, ModusRentang4.modusRentang4(data));
    }

    @Test
    public void modus05() {
        int[] data = {3, 3, 0, 1, 2, 1, 4, 1, 2, 1, 3, 1, 3, 4, 3, 3, 4};
        assertArrayEquals(new int[]{1, 3}, ModusRentang4.modusRentang4(data));
    }
}


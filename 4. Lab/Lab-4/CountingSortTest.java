import static org.junit.Assert.*;
import org.junit.Test;

public class CountingSortTest {

    @Test
    public void testBasic() {
        int[] data = {4, 0, 3, 2, 1};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, CountingSort.countingSort(data));
    }

    @Test
    public void testDuplicateElements() {
        int[] data = {4, 4, 3, 2, 2, 0, 1, 1};
        assertArrayEquals(new int[]{0, 1, 1, 2, 2, 3, 4, 4}, CountingSort.countingSort(data));
    }

    @Test
    public void testEmptyArray() {
        int[] data = {};
        assertArrayEquals(new int[]{}, CountingSort.countingSort(data));
    }

    @Test
    public void testInvalidValue() {
        int[] data = {0, 1, 2, 3, 5};
        assertArrayEquals(new int[]{}, CountingSort.countingSort(data));
    }

    @Test
    public void testNegativeValue() {
        int[] data = {-1, 2, 3, 0};
        assertArrayEquals(new int[]{}, CountingSort.countingSort(data));
    }
}

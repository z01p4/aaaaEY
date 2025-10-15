import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixSegitigaSamaKakiTest {

    @Test
    public void testSize5() {
        int[][] expected = {
                {0},
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9},
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1},
                {2, 3},
                {4}
        };
        assertArrayEquals(expected, MatrixSegitigaSamaKaki.buildMatrixSegitigaSamaKaki(5));
    }

    @Test
    public void testSize3() {
        int[][] expected = {
                {0},
                {1, 2},
                {3, 4, 5},
                {6, 7},
                {8}
        };
        assertArrayEquals(expected, MatrixSegitigaSamaKaki.buildMatrixSegitigaSamaKaki(3));
    }

    @Test
    public void testZero() {
        assertArrayEquals(new int[][]{}, MatrixSegitigaSamaKaki.buildMatrixSegitigaSamaKaki(0));
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixEvenSumTest {

    @Test
    public void testBasicMatrix() {
        int[][] matrix = {
                {1, 2},
                {2, 3},
                {4, 5}
        };
        int expected = 8; // 2 + 2 + 4 = 8
        assertEquals(expected, MatrixEvenSum.evenSum(matrix));
    }

    @Test
    public void testAllEven() {
        int[][] matrix = {
                {2, 4},
                {6, 8}
        };
        int expected = 20;
        assertEquals(expected, MatrixEvenSum.evenSum(matrix));
    }

    @Test
    public void testAllOdd() {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11}
        };
        int expected = 0;
        assertEquals(expected, MatrixEvenSum.evenSum(matrix));
    }

    @Test
    public void testEmptyMatrix() {
        int[][] matrix = {};
        int expected = 0;
        assertEquals(expected, MatrixEvenSum.evenSum(matrix));
    }

    @Test
    public void testNullMatrix() {
        int expected = 0;
        assertEquals(expected, MatrixEvenSum.evenSum(null));
    }
}


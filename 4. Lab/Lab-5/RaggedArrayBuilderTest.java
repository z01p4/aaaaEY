import static org.junit.Assert.*;
import org.junit.Test;

public class RaggedArrayBuilderTest {

    @Test
    public void testBuildRaggedSize5() {
        int[][] expected = {
                {0},
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9},
                {0, 1, 2, 3, 4}
        };
        assertArrayEquals(expected, RaggedArrayBuilder.buildRaggedArraysIncr(5));
    }

    @Test
    public void testBuildRaggedSize3() {
        int[][] expected = {
                {0},
                {1, 2},
                {3, 4, 5}
        };
        assertArrayEquals(expected, RaggedArrayBuilder.buildRaggedArraysIncr(3));
    }

    @Test
    public void testSizeZero() {
        int[][] expected = {};
        assertArrayEquals(expected, RaggedArrayBuilder.buildRaggedArraysIncr(0));
    }

    @Test
    public void testSizeNegative() {
        int[][] expected = {};
        assertArrayEquals(expected, RaggedArrayBuilder.buildRaggedArraysIncr(-2));
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

public class SquaresPositionTest {

    @Test
    public void test01a(){
        assertEquals("Kotak beririsan atas", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition(1, 10, 5, 2, 11, 3));
    }

    @Test
    public void test01b(){
        assertEquals("Kotak beririsan atas dibalik", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition(2, 11, 3,1, 10, 5));
    }

    @Test
    public void test02a(){
        assertEquals("Kotak beririsan bawah", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition(1, 10, 5, 2, 6, 3));
    }

    @Test
    public void test02b(){
        assertEquals("Kotak beririsan bawah, dibalik", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition( 2, 6, 3, 1, 10, 5));
    }

    @Test
    public void test03a(){
        assertEquals("Kotak beririsan kanan", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition(3, 10, 5, 7, 11, 3));
    }

    @Test
    public void test03b(){
        assertEquals("Kotak beririsan kanan", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition( 7, 11, 3,3, 10, 5));
    }

    @Test
    public void test04a(){
        assertEquals("Kotak beririsan kiri, sisi kiri bersamaan", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition(1, 10, 5, 1, 9, 3));
    }

    @Test
    public void test04b(){
        assertEquals("Kotak beririsan kanan, sisi kanan bersamaan", SquaresPosition.BERIRISAN,
                 SquaresPosition.getPosition(1, 10, 5, 3, 9, 3));
    }

    @Test
    public void test05a(){
        assertEquals("Kotak terpisah atas", SquaresPosition.TERPISAH,
                 SquaresPosition.getPosition(1, 1, 3, 2, 4, 2));
    }

    @Test
    public void test05b(){
        assertEquals("Kotak terpisah atas, dibalik", SquaresPosition.TERPISAH,
                 SquaresPosition.getPosition(2, 4, 2,1, 1, 3));
    }

    @Test
    public void test06a(){
        assertEquals("Kotak terpisah bawah", SquaresPosition.TERPISAH,
                 SquaresPosition.getPosition(1, 20, 3, 2, 4, 2));
    }

    @Test
    public void test06b(){
        assertEquals("Kotak terpisah bawah, dibalik", SquaresPosition.TERPISAH,
                 SquaresPosition.getPosition(2, 4, 2,1, 20, 3));
    }

    @Test
    public void test07a(){
        assertEquals("Kotak terpisah kiri kanan", SquaresPosition.TERPISAH,
                 SquaresPosition.getPosition(1, 1, 3, 9, 4, 2));
    }

    @Test
    public void test07b(){
        assertEquals("Kotak terpisah kiri kanan, dibalik", SquaresPosition.TERPISAH,
                 SquaresPosition.getPosition(9, 4, 2,1, 1, 3));
    }
    @Test
    public void test08a(){
        assertEquals("Kotak kedua didalam kotak pertama", SquaresPosition.DI_DALAM,
                 SquaresPosition.getPosition(1, 10, 9, 2, 8, 5));
    }

    @Test
    public void test08b(){
        assertEquals("Kotak pertama didalam kotak kedua", SquaresPosition.DI_DALAM,
                 SquaresPosition.getPosition(2, 8, 5,1, 10, 9));
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

public class HitungPalindromeTest {

    @Test
    public void testKalimat1() {
        assertEquals(4, HitungPalindrome.totalPalindrome(
                "malam ini saya pergi ke makam dan saya dikagetkan oleh katak"));
    }

    @Test
    public void testKalimat2() {
        assertEquals(2, HitungPalindrome.totalPalindrome("kasur ini rusak"));
    }

    @Test
    public void testSatuKataPalindrome() {
        assertEquals(1, HitungPalindrome.totalPalindrome("level"));
    }

    @Test
    public void testTanpaPalindrome() {
        assertEquals(0, HitungPalindrome.totalPalindrome("halo dunia"));
    }
}


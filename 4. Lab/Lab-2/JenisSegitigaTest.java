import static org.junit.Assert.*;
import org.junit.Test;

public class JenisSegitigaTest {

    @Test
    public void checkSegitiga_case0() {
        assertEquals("Siku-siku", JenisSegitiga.jenisSegiga(3, 4, 5));
    }

    @Test
    public void checkSegitiga_case1() {
        assertEquals("Sama sisi", JenisSegitiga.jenisSegiga(4, 4, 4));
    }

    @Test
    public void checkSegitiga_case2() {
        assertEquals("Sama kaki", JenisSegitiga.jenisSegiga(4, 7, 4));
    }

    @Test
    public void checkSegitiga_case3() {
        assertEquals("Bukan segitiga", JenisSegitiga.jenisSegiga(9, 2, 1));
    }

    @Test
    public void checkSegitiga_case4() {
        assertEquals("Segitiga sembarang", JenisSegitiga.jenisSegiga(6, 4, 3));
    }
}

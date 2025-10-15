import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BiayaTransportasiTest {

    private final double[][] tarif = {
            {1000, 12000, 5000, 15000},
            {12000, 3000, 10000, 20000},
            {5000, 10000, 2000, 18000},
            {15000, 20000, 18000, 2000}
    };

    @Test
    void testAntarKotaBogorKeDepok() {
        assertEquals(5000, BiayaTransportasi.hitungBiayaTransportKurir(tarif, 0, 2));
    }

    @Test
    void testDalamKotaBogor() {
        assertEquals(1000, TransportKurir.hitungBiayaTransportKurir(tarif, 0, 0));
    }

    @Test
    void testDalamKotaJakarta() {
        assertEquals(3000, TransportKurir.hitungBiayaTransportKurir(tarif, 1, 1));
    }

    @Test
    void testBekasiKeDepok() {
        assertEquals(18000, TransportKurir.hitungBiayaTransportKurir(tarif, 3, 2));
    }

    @Test
    void testIndeksDiLuarBatas() {
        assertEquals(-1, TransportKurir.hitungBiayaTransportKurir(tarif, -1, 2));
        assertEquals(-1, TransportKurir.hitungBiayaTransportKurir(tarif, 0, 4));
    }

    @Test
    void testDataNullAtauKosong() {
        assertEquals(-1, TransportKurir.hitungBiayaTransportKurir(null, 0, 0));
        assertEquals(-1, TransportKurir.hitungBiayaTransportKurir(new double[0][0], 0, 0));
    }

    @Test
    void testMatriksTidakPersegi() {
        double[][] tidakPersegi = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertEquals(-1, TransportKurir.hitungBiayaTransportKurir(tidakPersegi, 0, 1));
    }

    @Test
    void testBarisNull() {
        double[][] rusak = {
                {1, 2},
                null
        };
        assertEquals(-1, TransportKurir.hitungBiayaTransportKurir(rusak, 0, 1));
    }
}


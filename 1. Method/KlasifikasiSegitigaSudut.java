public class KlasifikasiSegitigaSudut {
    public static final String BUKAN_SEGITIGA = "BUKAN_SEGITIGA";
    public static final String SAMA_SISI      = "SAMA_SISI";
    public static final String SAMA_KAKI      = "SAMA_KAKI";
    public static final String SEMBARANG      = "SEMBARANG";

    public static final String SIKU_SIKU = "SIKU_SIKU";
    public static final String TAJAM     = "TAJAM";
    public static final String TUMPUL    = "TUMPUL";

    // mengembalikan gabungan: "<KELAS_SUDUT> <KELAS_SISI>", atau BUKAN_SEGITIGA
    public static String tipeSegitiga(int a, int b, int c) {
        // -- validasi dasar
        if (a <= 0 || b <= 0 || c <= 0) return BUKAN_SEGITIGA;
        if (!(a + b > c && a + c > b && b + c > a)) return BUKAN_SEGITIGA;

        // -- klasifikasi sisi
        String kelasSisi;
        if (a == b && b == c) {
            kelasSisi = SAMA_SISI;
        } else if (a == b || b == c || a == c) {
            kelasSisi = SAMA_KAKI;
        } else {
            kelasSisi = SEMBARANG;
        }

        // -- klasifikasi sudut: urutkan sisi sehingga z = sisi terpanjang
        int x = a, y = b, z = c;
        if (x > y) { int t = x; x = y; y = t; }
        if (y > z) { int t = y; y = z; z = t; }
        if (x > y) { int t = x; x = y; y = t; }

        // bandingkan x^2 + y^2 terhadap z^2
        int x2 = x * x;
        int y2 = y * y;
        int z2 = z * z;

        String kelasSudut;
        int sum = x2 + y2;
        if (sum == z2) {
            kelasSudut = SIKU_SIKU;
        } else if (sum > z2) {
            kelasSudut = TAJAM;
        } else {
            kelasSudut = TUMPUL;
        }

        return kelasSudut + " " + kelasSisi;
    }
}

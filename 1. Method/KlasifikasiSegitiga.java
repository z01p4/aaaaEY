public class KlasifikasiSegitiga {
    public static final String BUKAN_SEGITIGA = "BUKAN_SEGITIGA";
    public static final String SAMA_SISI      = "SAMA_SISI";
    public static final String SAMA_KAKI      = "SAMA_KAKI";
    public static final String SEMBARANG      = "SEMBARANG";

    // menerima 3 sisi segitiga (bilangan bulat positif)
    public static String tipeSegitiga(int a, int b, int c) {
        // -- validasi sisi (harus positif)
        if (a <= 0 || b <= 0 || c <= 0) {
            return BUKAN_SEGITIGA;
        }

        // -- cek syarat segitiga: jumlah dua sisi > sisi ketiga (semua pasangan)
        if (!(a + b > c && a + c > b && b + c > a)) {
            return BUKAN_SEGITIGA;
        }

        // -- klasifikasi
        if (a == b && b == c) {
            return SAMA_SISI;
        } else if (a == b || b == c || a == c) {
            return SAMA_KAKI;
        } else {
            return SEMBARANG;
        }
    }
}


public class StatusDuaLingkaranExpert {
    // konstanta hasil
    public static final String TERPISAH = "TERPISAH";
    public static final String DI_DALAM = "DI_DALAM";
    public static final String BERIRISAN = "BERIRISAN";

    // signature sesuai soal
    public static String statusDuaLingkaranExpert(int r1, int x1, int y1,
                                            int r2, int x2, int y2) {
        // -- hitung jarak antar pusat (pakai logika yang sama: sqrt(x^2 + y^2))
        int dx = x2 - x1;
        int dy = y2 - y1;
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        // -- batas-batas perbandingan
        int sum = r1 + r2;
        int diff = Math.abs(r1 - r2);

        // -- keputusan (tangent = beririsan)
        if (distance > sum) {
            return TERPISAH;            // jarak lebih besar dari jumlah jari-jari
        } else if (distance < diff) {
            return DI_DALAM;            // salah satu di dalam yang lain tanpa beririsan
        } else {
            return BERIRISAN;           // sisanya: berpotongan atau menyinggung
        }
    }
}


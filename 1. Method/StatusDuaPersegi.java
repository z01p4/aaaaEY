public class StatusDuaPersegi {
    public static final String TERPISAH  = "TERPISAH";
    public static final String DI_DALAM  = "DI_DALAM";
    public static final String BERIRISAN = "BERIRISAN";

    public static String statusDuaPersegi(int sisi1, int sisi2, int x2, int y2) {
        // -- setengah panjang sisi (pakai double agar tidak terpotong)
        double h1 = sisi1 / 2.0;
        double h2 = sisi2 / 2.0;

        // -- jarak antar pusat di tiap sumbu (karena axis-aligned)
        double dx = Math.abs(x2);
        double dy = Math.abs(y2);

        if (dx > h1 + h2 || dy > h1 + h2) {
            return TERPISAH;
        }

        if (dx < h1 - h2 && dy < h1 - h2) {
            return DI_DALAM;
        }
        // persegi 1 di dalam persegi 2
        if (dx < h2 - h1 && dy < h2 - h1) {
            return DI_DALAM;
        }

        return BERIRISAN;
    }
}


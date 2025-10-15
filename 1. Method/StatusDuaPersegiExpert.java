public class StatusDuaPersegiExpert {
    public static final String TERPISAH  = "TERPISAH";
    public static final String DI_DALAM  = "DI_DALAM";
    public static final String BERIRISAN = "BERIRISAN";

    // sisi1 berpusat di (x1,y1), sisi2 berpusat di (x2,y2)
    public static String statusDuaPersegi(int sisi1, int x1, int y1,
                                          int sisi2, int x2, int y2) {
        // -- setengah sisi (pakai double supaya tidak terpotong)
        double h1 = sisi1 / 2.0;
        double h2 = sisi2 / 2.0;

        // -- jarak antar pusat per sumbu (pakai nilai mutlak)
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);

        // -- cek terpisah (ada celah pada sumbu X atau Y)
        if (dx > h1 + h2 || dy > h1 + h2) {
            return TERPISAH;
        }

        // -- cek benar-benar di dalam (tanpa menyentuh tepi)
        // persegi 2 di dalam persegi 1
        if (dx < h1 - h2 && dy < h1 - h2) {
            return DI_DALAM;
        }
        // persegi 1 di dalam persegi 2
        if (dx < h2 - h1 && dy < h2 - h1) {
            return DI_DALAM;
        }

        // -- selebihnya: beririsan (overlap atau menyinggung sisi/pojok)
        return BERIRISAN;
    }
}

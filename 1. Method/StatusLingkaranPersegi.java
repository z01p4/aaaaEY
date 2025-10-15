public class StatusLingkaranPersegi {
    public static final String TERPISAH  = "TERPISAH";
    public static final String DI_DALAM  = "DI_DALAM";
    public static final String BERIRISAN = "BERIRISAN";

    // persegi pusat (xs,ys), sisi s; lingkaran pusat (xc,yc), radius r
    public static String statusLingkaranPersegi(int xs,int ys,int s, int xc,int yc,int r) {
        // -- setengah sisi persegi
        double h = s / 2.0;

        // -- offset pusat lingkaran terhadap pusat persegi (pakai nilai mutlak)
        double dx = Math.abs(xc - xs);
        double dy = Math.abs(yc - ys);

        // -- jarak dari pusat lingkaran ke persegi (0 jika di dalam proyeksi)
        double nx = Math.max(0.0, dx - h);
        double ny = Math.max(0.0, dy - h);
        double dist2 = nx * nx + ny * ny;        // kuadrat jarak terdekat ke persegi
        double r2 = (double) r * r;

        // -- 1) cek terpisah: jika jarak terdekat ke persegi > r
        if (dist2 > r2) {
            return TERPISAH;
        }

        // -- 2) cek "lingkaran di dalam persegi" (tanpa menyentuh tepi)
        // pusat lingkaran cukup jauh dari semua sisi: margin h - r di kedua sumbu
        if (dx < h - r && dy < h - r) {
            return DI_DALAM;
        }

        // -- 3) cek "persegi di dalam lingkaran" (tanpa menyentuh tepi)
        // semua sudut persegi harus benar-benar di dalam lingkaran;
        // sudut yang TERJAUH dari pusat lingkaran adalah (dx + h, dy + h)
        double far2 = (dx + h) * (dx + h) + (dy + h) * (dy + h);
        if (far2 < r2) {
            return DI_DALAM;
        }

        // -- 4) selebihnya: beririsan (overlap atau menyinggung sisi/pojok)
        return BERIRISAN;
    }
}


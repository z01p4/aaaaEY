public class StatusDuaPersegiPanjang {
    public static final String TERPISAH  = "TERPISAH";
    public static final String DI_DALAM  = "DI_DALAM";
    public static final String BERIRISAN = "BERIRISAN";

    // rect1: (x1min,y1min)-(x1max,y1max), rect2: (x2min,y2min)-(x2max,y2max)
    public static String statusDuaPersegiPanjang(int x1min,int y1min,int x1max,int y1max,
                                                 int x2min,int y2min,int x2max,int y2max) {
        // -- normalisasi agar min <= max
        int axmin = Math.min(x1min, x1max);
        int axmax = Math.max(x1min, x1max);
        int aymin = Math.min(y1min, y1max);
        int aymax = Math.max(y1min, y1max);

        int bxmin = Math.min(x2min, x2max);
        int bxmax = Math.max(x2min, x2max);
        int bymin = Math.min(y2min, y2max);
        int bymax = Math.max(y2min, y2max);

        // -- cek terpisah (ada celah murni di X atau Y)
        if (axmax < bxmin || bxmax < axmin || aymax < bymin || bymax < aymin) {
            return TERPISAH;
        }

        // -- cek "benar-benar di dalam" (tanpa menyentuh tepi)
        boolean bDiDalamA = (axmin < bxmin && aymin < bymin && axmax > bxmax && aymax > bymax);
        boolean aDiDalamB = (bxmin < axmin && bymin < aymin && bxmax > axmax && bymax > aymax);
        if (bDiDalamA || aDiDalamB) {
            return DI_DALAM;
        }

        // -- selebihnya: beririsan (overlap atau menyinggung sisi/pojok)
        return BERIRISAN;
    }
}


public class SquaresPosition {
    public static final String BERIRISAN = "BERIRISAN";
    public static final String TERPISAH = "TERPISAH";
    public static final String DI_DALAM = "DI_DALAM";

    public static String getPosition(int x1, int y1, int s1, int x2, int y2, int s2) {
        // Inisilisiasi atribut x1
        int x1Maks = x1 + s1;
        int x1Min = x1;

        // Inisilisiasi atribut y1
        int y1Maks = y1;
        int y1Min = y1 - s1;

        // Inisialisasi atribut x2
        int x2Maks = x2 + s2;
        int x2Min = x2;

        // Inisialisasi atribut y2
        int y2Maks = y2;
        int y2Min = y2 - s2;

        // Logika terpisah
        if (x1Maks <= x2Min || x2Maks <= x1Min || y1Min >= y2Maks || y2Min >= y1Maks) {
            return TERPISAH;
        }

        // Logika kotak di dalam
        if ((x1Min >= x2Min && x1Maks <= x2Maks && y1Min >= y2Min && y1Maks <= y2Maks) ||
                (x2Min >= x1Min && x2Maks <= x1Maks && y2Min >= y1Min && y2Maks <= y1Maks)) {
            return DI_DALAM;
        }

        // Logika apabila beririsan
        return BERIRISAN;
    }
}
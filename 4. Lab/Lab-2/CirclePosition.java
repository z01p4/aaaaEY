public class CirclePosition {
    public static final String DI_LUAR = "DI_LUAR";
    public static final String DI_DALAM = "DI_DALAM";
    public static final String BERIRISAN = "BERIRISAN";

    public static String getPosition(int r1, int r2, int x, int y) {
        // Inisialisasi
        double distance;

        // Logika mencari jarak
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Output program
        if (r1 + r2 < distance) {
            return DI_LUAR;
        } else if (r2 + distance < r1) {
            return DI_DALAM;
        } else {
            return BERIRISAN;
        }
    }
}

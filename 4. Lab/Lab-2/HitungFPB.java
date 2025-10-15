public class HitungFPB {
    public static int hitungFPB(int x, int y) {
        // Inisialisasi
        int pembagi, tdkPembagi;

        // Logika mencari pembagi
        if (x >= y) {
            pembagi = y;
        } else {
            pembagi = x;
        }

        // Logika utama program
        if (x % pembagi == 0 && y % pembagi == 0) {
            return pembagi;
        } else {
            for (int i = pembagi; i > 0; i--) {
                if (x % i == 0 && y % i == 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}
// ===== ModusRentang4.java =====
public class ModusRentang4 {

    // Mencari elemen-elemen yang paling sering muncul (modus)
    // dari array yang hanya boleh berisi angka 0–4
    public static int[] modusRentang4(int[] data) {
        // --- Validasi input ---
        if (data == null || data.length == 0) {
            return new int[]{}; // array kosong
        }

        // --- Cek apakah semua elemen valid (0–4) ---
        for (int n : data) {
            if (n < 0 || n > 4) {
                return new int[]{}; // langsung kosong jika ada nilai di luar 0–4
            }
        }

        // --- Hitung frekuensi setiap angka 0–4 ---
        int[] frek = new int[5];
        for (int n : data) {
            frek[n]++;
        }

        // --- Cari frekuensi maksimum ---
        int max = 0;
        for (int f : frek) {
            if (f > max) max = f;
        }

        // --- Kumpulkan semua angka dengan frekuensi maksimum ---
        int count = 0;
        for (int f : frek) {
            if (f == max) count++;
        }

        int[] hasil = new int[count];
        int idx = 0;
        for (int i = 0; i < frek.length; i++) {
            if (frek[i] == max) {
                hasil[idx++] = i;
            }
        }

        return hasil;
    }
}


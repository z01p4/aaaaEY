// ===== CountingSort.java =====
public class CountingSort {

    // Melakukan counting sort untuk data yang hanya berisi angka 0–4
    // Jika ada angka di luar rentang → return array kosong
    public static int[] countingSort(int[] data) {
        // --- Validasi input ---
        if (data == null || data.length == 0) {
            return new int[]{}; // array kosong
        }

        // --- Cek apakah semua elemen valid (0–4) ---
        for (int n : data) {
            if (n < 0 || n > 4) {
                return new int[]{}; // tidak valid
            }
        }

        // --- Counting sort ---
        int[] count = new int[5]; // indeks 0–4
        for (int n : data) {
            count[n]++;
        }

        // Buat hasil urutan baru
        int[] sorted = new int[data.length];
        int idx = 0;

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sorted[idx++] = i;
            }
        }

        return sorted;
    }
}

import java.util.*;

public class NilaiMatkulUtils {

    // Soal 1: ambil nilai angka pada [mahasiswa][matkul]
    public static double hitungNilaiAkhir(double[][] data, int indeksMahasiswa, int indeksMatkul) {
        if (!isMatrixValid(data)) return -1;
        int nMhs = data.length;
        int nMk = data[0].length;
        if (indeksMahasiswa < 0 || indeksMahasiswa >= nMhs) return -1;
        if (indeksMatkul < 0 || indeksMatkul >= nMk) return -1;
        return data[indeksMahasiswa][indeksMatkul];
    }

    // Soal 2: rata-rata tiap mahasiswa (baris)
    public static double[] hitungRataRataMahasiswa(double[][] data) {
        if (!isMatrixValid(data)) return new double[0];
        int nMhs = data.length, nMk = data[0].length;
        double[] rata = new double[nMhs];
        for (int i = 0; i < nMhs; i++) {
            double sum = 0;
            for (int j = 0; j < nMk; j++) sum += data[i][j];
            rata[i] = sum / nMk;
        }
        return rata;
    }

    // Soal 3: nilai tertinggi per mata kuliah (per kolom)
    public static double[] cariNilaiTertinggi(double[][] data) {
        if (!isMatrixValid(data)) return new double[0];
        int nMhs = data.length, nMk = data[0].length;
        double[] maxPerMk = new double[nMk];
        Arrays.fill(maxPerMk, Double.NEGATIVE_INFINITY);
        for (int j = 0; j < nMk; j++) {
            for (int i = 0; i < nMhs; i++) {
                if (data[i][j] > maxPerMk[j]) maxPerMk[j] = data[i][j];
            }
        }
        return maxPerMk;
    }

    // Soal 4: indeks mahasiswa dengan rata-rata tertinggi (tie -> indeks terkecil)
    public static int cariMahasiswaTerbaik(double[][] data) {
        if (!isMatrixValid(data)) return -1;
        double[] rata = hitungRataRataMahasiswa(data);
        int best = 0;
        for (int i = 1; i < rata.length; i++) {
            if (rata[i] > rata[best]) best = i;
        }
        return best;
    }

    // Soal 5: hitung biaya SKS per mahasiswa
    // Aturan: nilai >= 75 bayar penuh biayaPerMatkul[j], else diskon 50%
    public static double hitungBiayaSks(double[][] nilai, double[] biayaPerMatkul, int indeksMahasiswa) {
        if (!isMatrixValid(nilai)) return -1;
        int nMk = nilai[0].length;
        if (biayaPerMatkul == null || biayaPerMatkul.length != nMk) return -1;
        if (indeksMahasiswa < 0 || indeksMahasiswa >= nilai.length) return -1;

        double total = 0;
        for (int j = 0; j < nMk; j++) {
            double fee = biayaPerMatkul[j];
            double n = nilai[indeksMahasiswa][j];
            total += (n >= 75) ? fee : (0.5 * fee);
        }
        return total;
    }

    // ---------- Util ----------
    private static boolean isMatrixValid(double[][] m) {
        if (m == null || m.length == 0 || m[0] == null) return false;
        int cols = m[0].length;
        if (cols == 0) return false;
        for (double[] row : m) if (row == null || row.length != cols) return false;
        return true;
    }

    // ---------- Demo kecil ----------
    public static void main(String[] args) {
        // Tabel contoh (baris = mahasiswa, kolom = matkul)
        // 0-Andi, 1-Budi, 2-Citra
        double[][] data = {
                {80, 90, 75, 85},   // Andi
                {70, 60, 80, 90},   // Budi
                {85, 95, 90, 100}   // Citra
        };
        String[] mhs = {"Andi", "Budi", "Citra"};
        String[] mk  = {"Algoritma", "PBO", "Basis Data", "Struktur Data"};

        // Soal 1
        System.out.println("Soal1 nilai Budi - Struktur Data: " + hitungNilaiAkhir(data, 1, 3)); // 90

        // Soal 2
        System.out.println("Soal2 rata-rata tiap mahasiswa: " + Arrays.toString(hitungRataRataMahasiswa(data))); // [82.5, 75.0, 92.5]

        // Soal 3
        System.out.println("Soal3 nilai tertinggi per matkul: " + Arrays.toString(cariNilaiTertinggi(data))); // [85, 95, 90, 100]

        // Soal 4
        int terbaik = cariMahasiswaTerbaik(data);
        System.out.println("Soal4 mahasiswa terbaik: " + terbaik + " - " + mhs[terbaik]); // 2 - Citra

        // Soal 5
        double[] biayaPerMatkul = {500_000, 600_000, 550_000, 650_000};
        System.out.println("Soal5 biaya SKS Budi: " + (long)hitungBiayaSks(data, biayaPerMatkul, 1)); // 1_750_000
    }
}


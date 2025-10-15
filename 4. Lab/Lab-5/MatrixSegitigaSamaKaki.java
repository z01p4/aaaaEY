// ===== MatrixSegitigaSamaKaki.java =====
public class MatrixSegitigaSamaKaki {

    // Membangun matriks segitiga sama kaki
    public static int[][] buildMatrixSegitigaSamaKaki(int size) {
        if (size <= 0) return new int[][]{}; // validasi input

        // total baris = naik ke size, lalu turun lagi (size-1)
        int totalRows = 2 * size - 1;
        int[][] matrix = new int[totalRows][];

        int bil = 0; // angka berjalan, berulang modulo 10

        for (int i = 0; i < totalRows; i++) {
            int panjang;
            if (i < size) {
                // fase naik: baris ke-i punya (i+1) kolom
                panjang = i + 1;
            } else {
                // fase turun: baris setelah size punya kolom berkurang
                panjang = totalRows - i;
            }

            matrix[i] = new int[panjang];
            for (int j = 0; j < panjang; j++) {
                matrix[i][j] = bil % 10;
                bil++;
            }
        }

        return matrix;
    }

    // Demo kecil
    public static void main(String[] args) {
        int[][] hasil = buildMatrixSegitigaSamaKaki(5);
        for (int[] baris : hasil) {
            for (int n : baris) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}


// ===== MatrixEvenSum.java =====
public class MatrixEvenSum {

    // Menjumlahkan semua elemen genap dalam matriks m x n
    public static int evenSum(int[][] matrix) {
        // Validasi input
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;

        // Loop baris dan kolom
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) continue; // lewati baris null

            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                if (value % 2 == 0) { // cek genap
                    sum += value;
                }
            }
        }

        return sum;
    }
}

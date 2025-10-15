public class RaggedArrayBuilder {
    public static int[][] buildRaggedArraysIncr(int size) {
        if (size <= 0) return new int[][]{}; // validasi

        int[][] matrix = new int[size][];
        int bil = 0;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1]; // jumlah kolom bertambah tiap baris

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = bil % 10; // isi 0–9 berulang
                bil++;
            }
        }

        return matrix;
    }

    // contoh kecil
    public static void main(String[] args) {
        int[][] hasil = buildRaggedArraysIncr(5);
        for (int[] row : hasil) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
public class AngkaArrayTerbalik {
    // buildRaggedArraysDecr: baris pertama panjang = size, lalu menurun hingga 1
    // isi 0..9 berulang seperti contoh:
    // 0 1 2 3 4
    // 5 6 7 8
    // 9 0 1
    // 2 3
    // 4
    public static int[][] buildRaggedArraysDecr(int size) {
        // kalau size <= 0, kembalikan array kosong
        if (size <= 0) return new int[0][];

        int[][] result = new int[size][];
        int nilai = 0; // pengisi 0..9 berulang

        for (int r = 0; r < size; r++) {
            int panjang = size - r;          // menurun: size, size-1, ..., 1
            result[r] = new int[panjang];
            for (int c = 0; c < panjang; c++) {
                result[r][c] = nilai;
                nilai = (nilai + 1) % 10;    // wrap setelah 9 -> 0
            }
        }
        return result;
    }

    // demo kecil (opsional)
    public static void main(String[] args) {
        int[][] a = buildRaggedArraysDecr(5);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j + 1 < a[i].length) System.out.print(" ");
            }
            System.out.println();
        }
    }
}


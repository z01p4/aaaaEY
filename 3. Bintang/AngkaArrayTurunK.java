public class AngkaArrayTurunK {
    // buildRaggedArraysK: bentuk huruf K
    // baris: size, size-1, ..., 1, 2, ..., size
    // pengisian: per kolom dari atas ke bawah (0..9 mod 10)
    public static int[][] buildRaggedArraysK(int size) {
        if (size <= 0) return new int[0][];

        int rows = 2 * size - 1;
        int[][] a = new int[rows][];

        // bentuk ragged lengths
        for (int r = 0; r < rows; r++) {
            int len = (r < size) ? (size - r) : (r - size + 2);
            a[r] = new int[len];
        }

        // isi per kolom (turun ke bawah), wrap 0..9
        int v = 0;
        for (int c = 0; c < size; c++) {
            for (int r = 0; r < rows; r++) {
                if (a[r].length > c) {
                    a[r][c] = v;
                    v = (v + 1) % 10;
                }
            }
        }
        return a;
    }

    // demo kecil
    public static void main(String[] args) {
        int[][] m = buildRaggedArraysK(4);
        for (int i = 0; i < m.length; i++) {
            System.out.print("{");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j + 1 < m[i].length) System.out.print(", ");
            }
            System.out.println("}");
        }
    }
}


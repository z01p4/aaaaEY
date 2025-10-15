public class AngkaArrayTurunSegitiga {
    // buildMatrixSegitigaSamaKaki: baris 1..size..1, isi angka 0..9 per kolom (vertikal)
    public static int[][] buildMatrixSegitigaSamaKaki(int size) {
        // kalau size tidak valid -> kembalikan array kosong
        if (size <= 0) return new int[0][];

        int rows = 2 * size - 1;     // total baris pada segitiga sama kaki
        int[][] a = new int[rows][];

        // bentuk panjang tiap baris: 1..size lalu size-1..1
        for (int r = 0; r < rows; r++) {
            int len = (r < size) ? (r + 1) : (2 * size - 1 - r);
            a[r] = new int[len];
        }

        // isi per kolom dari atas ke bawah (turun)
        int v = 0; // 0..9 berulang
        for (int c = 0; c < size; c++) {      // maksimal kolom = size
            for (int r = 0; r < rows; r++) {
                if (a[r].length > c) {        // baris ini punya kolom ke-c?
                    a[r][c] = v;
                    v = (v + 1) % 10;         // wrap setelah 9
                }
            }
        }
        return a;
    }

    // demo kecil (opsional)
    public static void main(String[] args) {
        int[][] m = buildMatrixSegitigaSamaKaki(5);
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

public class AngkaArrayTurun {
    // buildRaggedArraysColumnDown:
    // bentuk baris 1..size, lalu isi angka 0..9 (mod 10) per kolom dari atas ke bawah
    public static int[][] buildRaggedArraysColumnDown(int size) {
        if (size <= 0) return new int[0][];

        // bentuk ragged: baris ke-r panjangnya r+1
        int[][] a = new int[size][];
        for (int r = 0; r < size; r++) {
            a[r] = new int[r + 1];
        }

        int v = 0; // pengisi 0..9 berulang
        // isi per kolom: kolom c punya panjang size - c (baris mulai dari c)
        for (int c = 0; c < size; c++) {
            for (int r = c; r < size; r++) {
                a[r][c] = v;
                v = (v + 1) % 10;
            }
        }
        return a;
    }

    // demo kecil
    public static void main(String[] args) {
        int[][] a = buildRaggedArraysColumnDown(4);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j + 1 < a[i].length) System.out.print(" ");
            }
            System.out.println();
        }
    }
}


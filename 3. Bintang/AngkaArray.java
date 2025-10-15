public class AngkaArray {
    // buildRaggedArraysIncr: buat ragged matrix dengan isi 0..9 berulang
    public static int[][] buildRaggedArraysIncr(int size) {
        // kalau size <= 0, kembalikan array kosong
        if (size <= 0) return new int[0][];

        int[][] result = new int[size][];
        int nilai = 0; // pengisi yang naik 0..9 lalu balik ke 0

        for (int baris = 0; baris < size; baris++) {
            result[baris] = new int[baris + 1]; // panjang kolom = indeks+1
            for (int kolom = 0; kolom <= baris; kolom++) {
                result[baris][kolom] = nilai;
                nilai = (nilai + 1) % 10; // balik ke 0 setelah 9
            }
        }
        return result;
    }

    // demo kecil (opsional)
    public static void main(String[] args) {
        int[][] a = buildRaggedArraysIncr(5);
        for (int i = 0; i < a.length; i++) {
            System.out.print("{");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + (j + 1 < a[i].length ? "," : ""));
            }
            System.out.println("}");
        }
    }
}


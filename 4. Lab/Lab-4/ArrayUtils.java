// ===== ArrayUtils.java =====
public class ArrayUtils {
    // Menjumlahkan semua elemen ganjil di array.
    // Aturan: null atau array kosong -> hasil 0.
    public static int jumlahArrayGanjil(int[] data) {
        if (data == null || data.length == 0) return 0;

        int sum = 0;
        for (int x : data) {
            if (x % 2 != 0) { // ganjil (termasuk negatif ganjil)
                sum += x;
            }
        }
        return sum;
    }

    // demo singkat (opsional)
    public static void main(String[] args) {
        int hasil = jumlahArrayGanjil(new int[]{1, 2, 3, 4, 5});
        System.out.println(hasil); // 9
    }
}


// ===== CekPangkatDua.java =====
import java.util.Scanner;

public class CekPangkatDua {
    // true jika n = 2^k (k >= 0)
    public static boolean cekPangkatDua(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0; // trik bitwise klasik
    }

    // demo kecil
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n (cek pangkat dua): ");
        int n = sc.nextInt();

        System.out.println(cekPangkatDua(n) ? "PANGKAT DUA" : "BUKAN PANGKAT DUA");
    }
}

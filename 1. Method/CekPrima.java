// ===== CekPrima.java =====
import java.util.Scanner;

public class CekPrima {
    // cek apakah n prima (n >= 2, hanya habis dibagi 1 dan dirinya sendiri)
    public static boolean isPrima(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        // cukup cek sampai sqrt(n), lompat 2 (ganjil saja)
        int batas = (int)Math.sqrt(n);
        for (int d = 3; d <= batas; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

    // demo kecil
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n (cek prima): ");
        int n = sc.nextInt();

        System.out.println(isPrima(n) ? "PRIMA" : "BUKAN PRIMA");
    }
}


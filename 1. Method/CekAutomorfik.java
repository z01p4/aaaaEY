// ===== CekAutomorfik.java =====
import java.util.Scanner;

public class CekAutomorfik {
    // cek automorfik: n^2 berakhir dengan digit-digit n
    public static boolean cekAutomorfik(int n) {
        if (n < 0) return false;           // definisi umum non-negatif
        int k = (n == 0) ? 1 : 0;

        // hitung jumlah digit n
        int tmp = n;
        while (tmp != 0) {
            k++;
            tmp /= 10;
        }

        // pow10 = 10^k
        int pow10 = 1;
        for (int i = 0; i < k; i++) pow10 *= 10;

        long n2 = 1L * n * n;              // aman kalau n agak besar
        return (n2 % pow10) == n;
    }

    // demo kecil
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n (cek automorfik): ");
        int n = sc.nextInt();

        System.out.println(cekAutomorfik(n) ? "AUTOMORFIK" : "BUKAN AUTOMORFIK");
    }
}


// ===== CekPerfect.java =====
import java.util.Scanner;

public class CekPerfect {
    // cek bilangan sempurna: jumlah pembagi (kecuali n) == n
    public static boolean cekPerfect(int n) {
        if (n < 2) return false;           // 1 bukan perfect

        int sum = 1;                       // 1 selalu pembagi untuk n>=2
        int batas = (int)Math.sqrt(n);

        // loop pembagi berpasangan
        for (int d = 2; d <= batas; d++) {
            if (n % d == 0) {
                int pasangan = n / d;
                sum += d;
                if (pasangan != d) sum += pasangan; // tambahkan pasangan jika beda
                if (sum > n) return false;          // early exit kecil-kecilan
            }
        }

        return sum == n;
    }

    // demo kecil
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n (cek perfect): ");
        int n = sc.nextInt();

        System.out.println(cekPerfect(n) ? "PERFECT" : "BUKAN PERFECT");
    }
}


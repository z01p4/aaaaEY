// ===== CekArmstrong.java =====
import java.util.Scanner;

public class CekArmstrong {
    // cek angka Armstrong/Narcissistic:
    // jumlah (digit^k) == n, dengan k = jumlah digit (contoh: 153 -> 1^3 + 5^3 + 3^3 = 153)
    public static boolean isArmstrong(int n) {
        if (n < 0) return false; // definisi umum: non-negatif

        // hitung jumlah digit
        int k = (n == 0) ? 1 : 0;
        int tmp = n;
        while (tmp != 0) {
            k++;
            tmp /= 10;
        }

        // jumlahkan digit^k
        int sum = 0;
        tmp = n;
        while (tmp != 0) {
            int d = tmp % 10;
            // pakai Math.pow lalu cast ke int (cukup untuk nilai tugas umum)
            sum += (int)Math.round(Math.pow(d, k));
            tmp /= 10;
        }

        // khusus n = 0, loop di atas tidak jalan; Armstrong untuk 0 adalah true (0^1 = 0)
        if (n == 0) return true;

        return sum == n;
    }

    // demo kecil
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n (cek Armstrong): ");
        int n = sc.nextInt();

        System.out.println(isArmstrong(n) ? "ARMSTRONG" : "BUKAN ARMSTRONG");
    }
}

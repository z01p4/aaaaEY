import java.util.Scanner;

public class EucliedIteratif {
    // gcd iteratif (Euclid) -- menangani bilangan negatif juga
    public static int FPB(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        // kasus tepi: kalau salah satu 0
        if (a == 0) return b;
        if (b == 0) return a;

        // algoritma euclid iteratif
        while (b != 0) {
            int r = a % b; // sisa
            a = b;
            b = r;
        }
        return a; // a = gcd
    }

    // lcm iteratif, definisi: |a*b| / gcd(a,b)
    public static int KPK(int a, int b) {
        // jika ada yang 0, lcm didefinisikan 0
        if (a == 0 || b == 0) return 0;

        int g = FPB(a, b);
        // susun sebagai (a/g)*b untuk mengurangi peluang overflow int
        int result = (a / g) * b;

        // pastikan positif
        if (result < 0) result = -result;
        return result;
    }

    // demo kecil interaktif
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan b: ");
        int b = sc.nextInt();

        int g = FPB(a, b);
        int l = KPK(a, b);

        System.out.println("GCD = " + g);
        System.out.println("LCM = " + l);
    }
}


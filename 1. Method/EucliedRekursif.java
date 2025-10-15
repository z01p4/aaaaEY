import java.util.Scanner;

public class EucliedRekursif {
    // gcd rekursif (Euclid) -- aman untuk bilangan negatif
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;          // basis rekursi
        return gcd(b, a % b);          // langkah rekursi
    }

    // lcm pakai gcd (rekursif di dalam gcd)
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;               // definisi
        int g = gcd(a, b);
        int result = (a / g) * b;                     // kurangi risiko overflow
        if (result < 0) result = -result;             // pastikan positif
        return result;
    }

    // demo kecil interaktif
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Masukkan a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan b: ");
        int b = sc.nextInt();

        // output
        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));
    }
}


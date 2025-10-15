import java.util.Scanner;

public class BilanganTerkecilTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi
        int bilTerbesar, bilTerkecil;

        // Meminta input
        System.out.print("Masukkan angka ke-1: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan angka ke-2: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan angka ke-3: ");
        int c = scanner.nextInt();
        System.out.print("Masukkan angka ke-4: ");
        int d = scanner.nextInt();

        // Logika bilangan terbesar
        if (a >= b && a >= c && a>= d) {
            bilTerbesar = a;
        } else if (b >= a && b >= c && b >= d) {
            bilTerbesar = b;
        } else if (c >= a && c >= b && c >= d) {
            bilTerbesar = c;
        } else {
            bilTerbesar = d;
        }

        // Logika bilangan terkecil
        if (a <= b && a <= c && a <= d) {
            bilTerkecil = a;
        } else if (b <= a && b <= c && b <= d) {
            bilTerkecil = b;
        } else if (c <= a && c <= b && c <= d) {
            bilTerkecil = c;
        } else {
            bilTerkecil = d;
        }

        // Output program
        System.out.println("Bilangan terbesar adalah " + bilTerbesar);
        System.out.println("Bilantan terkecil adalah " + bilTerkecil);
    }
}

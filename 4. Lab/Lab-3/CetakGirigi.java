public class CetakGirigi {

    // Method utama: mencetak gerigi sejumlah "jumlah", dengan ukuran "ukuran"
    public static int cetakGirigi(int jumlah, int ukuran) {
        for (int i = 0; i < jumlah; i++) {
            cetakWajik(ukuran);
        }
        return jumlah;
    }

    // Cetak satu wajik penuh (gabungan segitiga atas + bawah)
    public static void cetakWajik(int ukuran) {
        cetakSegitigaAtas(ukuran);
        cetakSegitigaBawah(ukuran);
    }

    // Cetak segitiga atas
    public static void cetakSegitigaAtas(int ukuran) {
        for (int i = 1; i <= ukuran; i++) {
            cetakSpasi(ukuran - i);
            cetakBintang(2 * i - 1);
            System.out.println();
        }
    }

    // Cetak segitiga bawah
    public static void cetakSegitigaBawah(int ukuran) {
        for (int i = ukuran - 1; i >= 1; i--) {
            cetakSpasi(ukuran - i);
            cetakBintang(2 * i - 1);
            System.out.println();
        }
    }

    // Helper: cetak spasi
    public static void cetakSpasi(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(" ");
        }
    }

    // Helper: cetak bintang
    public static void cetakBintang(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print("*");
        }
    }

    // Main untuk coba manual
    public static void main(String[] args) {
        cetakGirigi(2, 5);
    }
}

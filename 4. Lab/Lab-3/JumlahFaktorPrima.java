public class JumlahFaktorPrima {

    // Method utama: menghitung jumlah faktor prima
    public static int hitungJumlahFaktorPrima(int bilangan) {
        int jumlah = 0;

        // Loop cek dari 2 sampai bilangan
        for (int i = 2; i <= bilangan; i++) {
            if (bilangan % i == 0 && isPrima(i)) {
                jumlah += i;
            }
        }

        return jumlah;
    }

    // Method bantu: cek apakah sebuah bilangan prima
    public static boolean isPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main untuk coba manual
    public static void main(String[] args) {
        System.out.println(hitungJumlahFaktorPrima(35));   // 12
        System.out.println(hitungJumlahFaktorPrima(121));  // 11
        System.out.println(hitungJumlahFaktorPrima(100));  // 7
        System.out.println(hitungJumlahFaktorPrima(30));   // 10
    }
}


public class HitungPalindrome {

    // Method utama: menghitung jumlah palindrome dalam string
    public static int totalPalindrome(String data) {
        int jumlah = 0;

        // Pecah kalimat menjadi kata-kata
        String[] kataKata = data.toLowerCase().split("\\s+");

        // Hitung palindrome per kata
        for (String kata : kataKata) {
            if (isPalindrome(kata)) {
                jumlah++;
            }
        }

        // Cek juga apakah seluruh kalimat adalah palindrome
        if (isPalindrome(data.replaceAll("\\s+", ""))) {
            jumlah++;
        }

        return jumlah;
    }

    // Method bantu: cek apakah string palindrome
    public static boolean isPalindrome(String teks) {
        int kiri = 0;
        int kanan = teks.length() - 1;

        while (kiri < kanan) {
            if (teks.charAt(kiri) != teks.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }
        return true;
    }

    // Main untuk coba manual
    public static void main(String[] args) {
        System.out.println(totalPalindrome("malam ini saya pergi ke makam dan saya dikagetkan oleh katak"));
        // output: 4

        System.out.println(totalPalindrome("kasur ini rusak"));
        // output: 2
    }
}


public class JenisSegitiga {
    public static String jenisSegiga(int a, int b, int c) {
        // Inisialisasi
        int terbesar, terkecil1, terkecil2;

        // Logika mencari yang terbesar
        if (a >= b && a >= c) {
            terbesar = a;
            terkecil1 = b;
            terkecil2 = c;
        } else if (b >= a && b >= c) {
            terbesar = b;
            terkecil1 = a;
            terkecil2 = c;
        } else {
            terbesar = c;
            terkecil1 = a;
            terkecil2 = b;
        }

        // Logika utama program
        if (Math.pow(terbesar, 2) == (Math.pow(terkecil1, 2) + Math.pow(terkecil2, 2))) {
            return "Siku-siku";
        } else if (terbesar >= terkecil1 + terkecil2) {
            return "Bukan segitiga";
        } else if (terbesar == terkecil1 && terbesar == terkecil2) {
            return "Sama sisi";
        } else if (terbesar == terkecil1 || terbesar == terkecil2 || terkecil1 == terkecil2) {
            return "Sama kaki";
        } else {
            return "Segitiga sembarang";
        }
    }
}
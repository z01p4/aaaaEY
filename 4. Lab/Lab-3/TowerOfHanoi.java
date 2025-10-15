public class TowerOfHanoi {

    // Method utama: menghitung jumlah langkah Tower of Hanoi
    public static void countTowerOfHanoi(int n) {
        int langkah = hitungLangkah(n);
        System.out.println("Jumlah langkah untuk Tower of Hanoi ukuran " + n + " adalah " + langkah);
    }

    // Rekursif: rumus countTowerOfHanoi
    public static int hitungLangkah(int n) {
        if (n == 1) {
            return 1;
        }
        return hitungLangkah(n - 1) * 2 + 1;
    }

    // Main untuk uji manual
    public static void main(String[] args) {
        countTowerOfHanoi(3); // 7
        countTowerOfHanoi(4); // 15
        countTowerOfHanoi(5); // 31
    }
}


import java.util.*;

public class BiayaTransportasi {
    public static double hitungBiayaTransportKurir(double[][] data, int indeksAsal, int indeksTujuan) {
        if (data == null || data.length == 0) throw new IllegalArgumentException("data kosong");
        int n = data.length;
        for (double[] row : data) if (row == null || row.length != n) throw new IllegalArgumentException("bukan matriks NxN");
        if (indeksAsal < 0 || indeksAsal >= n || indeksTujuan < 0 || indeksTujuan >= n) throw new IllegalArgumentException("indeks di luar jangkauan");
        return data[indeksAsal][indeksTujuan];
    }

    public static void hitungBiayaTransportKurir(Scanner sc) {
        try {
            int n = Integer.parseInt(sc.nextLine().trim());
            double[][] data = new double[n][n];
            for (int i = 0; i < n; i++) {
                String[] parts = sc.nextLine().trim().split("\\s+");
                if (parts.length != n) throw new IllegalArgumentException();
                for (int j = 0; j < n; j++) data[i][j] = Double.parseDouble(parts[j]);
            }
            String[] ab = sc.nextLine().trim().split("\\s+");
            if (ab.length != 2) throw new IllegalArgumentException();
            int asal = Integer.parseInt(ab[0]);
            int tujuan = Integer.parseInt(ab[1]);
            double biaya = hitungBiayaTransportKurir(data, asal, tujuan);
            if (biaya < 0) throw new IllegalArgumentException();
            if (biaya == Math.floor(biaya)) System.out.printf("%.0f%n", biaya); else System.out.println(biaya);
        } catch (Exception e) {
            System.out.println("Input tidak valid");
        }
    }

    public static void main(String[] args) {
        double[][] contoh = {
                {1000, 12000, 5000, 15000},
                {12000, 3000, 10000, 20000},
                {5000, 10000, 2000, 18000},
                {15000, 20000, 18000, 2000}
        };
        System.out.println(hitungBiayaTransportKurir(contoh, 0, 2));
        Scanner sc = new Scanner(System.in);
        // Format input interaktif:
        // n
        // n baris matriks (tiap baris n angka dipisah spasi)
        // indeksAsal indeksTujuan
        // Contoh:
        // 4
        // 1000 12000 5000 15000
        // 12000 3000 10000 20000
        // 5000 10000 2000 18000
        // 15000 20000 18000 2000
        // 0 2
        //hitungBiayaTransportKurir(sc);
    }
}


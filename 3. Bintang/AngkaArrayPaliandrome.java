public class AngkaArrayPaliandrome {

    public static int[][] AngkaArrayPaliandrome(int size) {
        int[][] result;
        if (size <= 0) {
            result = new int[0][];
        } else {
            int[][] a = new int[size][];
            for (int r = 1; r <= size; r++) {
                int len = 2 * r - 1;
                a[r - 1] = new int[len];
                // naik 1..r
                int idx = 0;
                for (int x = 1; x <= r; x++) a[r - 1][idx++] = x;
                // turun r-1..1
                for (int x = r - 1; x >= 1; x--) a[r - 1][idx++] = x;
            }
            result = a;
        }
        return result;
    }
}
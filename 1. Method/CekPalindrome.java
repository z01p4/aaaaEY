import java.util.Scanner;

public class CekPalindrome {
    // cek palindrom ketat (case & spasi dihitung)
    public static boolean isPalindrom(String s) {
        if (s == null) return false;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // demo kecil
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = sc.nextLine();

        System.out.println(isPalindrom(teks) ? "PALINDROM" : "BUKAN PALINDROM");
    }
}

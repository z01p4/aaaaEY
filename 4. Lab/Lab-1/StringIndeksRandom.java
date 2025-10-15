import java.util.Scanner;

public class StringIndeksRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sebuah kalimat
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        //
        int indeksA = (int) Math.floor(Math.random() * kalimat.length());
        int indeksB = indeksA + (int) Math.floor(Math.random() * (kalimat.length() - indeksA));
    }
}

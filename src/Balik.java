import java.util.Scanner;

public class Balik {
    public static void main(String[] args) {
        System.out.print("Masukkan suatu String: ");
        Scanner scan = new Scanner(System.in);
        String teks = scan.nextLine();

        for ( int i = teks.length() - 1; i >= 0; i--)
            System.out.print(teks.charAt(i));

        System.out.println(); // Pindah baris
    }
}

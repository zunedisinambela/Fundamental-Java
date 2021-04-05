import java.util.Scanner;

public class Kotak2 {
    public static void main(String[] args) {
        System.out.print("Tinggi kotak: ");
        Scanner scan = new Scanner(System.in);
        int tinggi = scan.nextInt();

        System.out.print("Lebar kotak: ");
        int lebar = scan.nextInt();

        // Buat bingkai atas
        for ( int kolom = 1; kolom <= lebar; kolom++)
            System.out.print('*');

        System.out.println();

        // Buat kiri dan kanan untuk
        // Baris = 2 s/d (tinggi-1)
        for ( int baris = 2; baris <= tinggi-1; baris++) {
            String format = "*%" + String.valueOf(lebar-1) + "c";
            System.out.printf(format, '*');
            System.out.println(); // Pindah baris
        }

        // Buat bingkai bawah
        for ( int kolom = 1; kolom <= lebar; kolom++)
            System.out.print('*');

        System.out.println();
    }
}

import java.util.Scanner;

public class Kotak {
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
        // baris = 2 s/d (tinggi-1)
        for ( int baris = 2; baris <= tinggi-1; baris++) {
            System.out.print('*');
            for ( int kolom = 2; kolom <= lebar-1; kolom++)
                System.out.print(' '); // Spasi
            System.out.println('*');
        }

        // Buat bingkai bawah
        for ( int kolom = 1; kolom <= lebar; kolom++)
            System.out.print('*');
        System.out.println();
    }
}

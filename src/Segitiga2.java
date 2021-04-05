import java.util.Scanner;

public class Segitiga2 {
    public static void main(String[] args) {
        boolean bintang;

        System.out.print("Tinggi Segitiga: ");
        Scanner scan = new Scanner(System.in);
        int tinggi = scan.nextInt();

        for ( int i = 1; i <= tinggi; i++) {
            // Tentukan simbol awal
            if ( i % 2 == 1)
                bintang = true;
            else
                bintang = false;

            // Proses untuk menggambar simbol per baris
            for ( int j = 1; j <= i; j ++) {
                if ( bintang )
                    System.out.print('*');
                else
                    System.out.print('-');
                bintang = !bintang; // Balik keadaan bintang
            }

            System.out.println(); // Pindah baris
        }
    }
}

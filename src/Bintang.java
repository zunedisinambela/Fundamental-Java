import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for ( int i = 1; i <= n; i++) {
            // Tampilkan sejumlah karakter spasi
            for ( int j = 1; j < i; j++)
                System.out.print((char) 32);

            // Tampilkan * dan pindah baris
            System.out.println('*');
        }
    }
}

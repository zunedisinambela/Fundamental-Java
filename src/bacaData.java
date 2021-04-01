import java.util.Scanner;

public class bacaData {
    public static void main(String[] args) {
        double panjang, lebar, keliling;

        // Buat objek Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Menghitung keliling persegi panjang");

        System.out.print("Panjang: ");
        panjang = scan.nextDouble();

        System.out.print("Lebar: ");
        lebar = scan.nextDouble();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling = " + keliling);
    }
}

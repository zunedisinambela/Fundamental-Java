import java.util.Scanner;

public class Genap {
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah bilangan bulat: ");
        Scanner scan = new Scanner(System.in);

        int bilangan = scan.nextInt();

        String keterangan = "bilangan genap";
        int sisa = bilangan % 2;
        if (sisa == 1)
            keterangan = "bilangan ganjil";

        System.out.println(bilangan + " adalah " + keterangan);
    }
}

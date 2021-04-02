import java.util.Scanner;

public class Kondisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scan.nextInt();

        int sisa = bilangan % 2;
        String keterangan = sisa == 1 ? "bilangan ganjil" : "bilangan genap";
        System.out.println(bilangan + " adalah " + keterangan);
    }
}

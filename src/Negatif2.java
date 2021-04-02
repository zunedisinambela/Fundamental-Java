import java.util.Scanner;

public class Negatif2 {
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah bilangan bulat: ");
        Scanner scan = new Scanner(System.in);
        int bilangan = scan.nextInt();

        String keterangan = "Oke, Anda memasukkan bilangan positif";
        if (bilangan < 0)
            System.out.println(bilangan + " adalah ");
        keterangan = "bilangan negatif";
        System.out.println(keterangan);
    }
}

import java.util.Scanner;

public class alternatifIf {
    public static void main(String[] args) {
        System.out.print("Memasukkan sebuah bilangan bulat: ");
        Scanner scan = new Scanner(System.in);

        int bilangan = scan.nextInt();

        String keterangan;
        boolean genap = (bilangan % 2 == 0);
        if (genap)
            keterangan = "bilangan genap";
        else
            keterangan = "bilagan ganjil";

        System.out.println(bilangan + " adalah " + keterangan);
    }
}

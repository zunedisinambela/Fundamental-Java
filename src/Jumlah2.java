import java.util.Scanner;

public class Jumlah2 {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int tanda = 1;
        double jum = 0;

        while ( i <= n ) {
            jum += tanda * (1.0 / i);
            tanda = -tanda;

            i += 2;
        }
        System.out.println("Jumlah = " + jum);
    }
}

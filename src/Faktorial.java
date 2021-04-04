import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        long hasil = 1;

        while ( i <= n ) {
            hasil *= i;

            i += 1;
        }
        System.out.println(n + "! = " + hasil);
    }
}

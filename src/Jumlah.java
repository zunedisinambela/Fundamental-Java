import java.util.Scanner;

public class Jumlah {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int jum = 0;

        while ( i <= n ) {
            jum += i;
            i += 1;
        }
        System.out.println("Jumlah = " + jum);
    }
}

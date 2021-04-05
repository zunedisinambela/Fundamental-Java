import java.util.Scanner;

public class jumFor {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int jum = 0;
        for ( int i = 1; i <= n; i++)
            jum += i;

        System.out.println("Jumlah = " + jum);
    }
}

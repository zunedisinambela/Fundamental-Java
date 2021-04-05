import java.util.Scanner;

public class fakFor {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long hasil = 1;
        for ( int i = 1; i <= n; i++)
            hasil *= i;

        System.out.println( n + "! = " + hasil);
    }
}

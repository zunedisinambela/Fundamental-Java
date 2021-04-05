import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Menampilkan deret bilangan Fibonacci");
        System.out.print("Sampai suku (n > 2): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Tampilkan dua suku pertama
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        // Tampilkan suku ketiga dst
        for ( int suku = 3; suku <= n; suku++) {
            int c = a + b;
            a = b; // b menjadi a
            b = c; // dan c menjadi b untuk kepentingan perhitungan suku berikutnya

            System.out.println(c);
        }
    }
}

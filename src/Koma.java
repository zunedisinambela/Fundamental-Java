import java.util.Scanner;

public class Koma {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for ( int i = 1, bil = 0; bil < n; bil += i, i++)
            System.out.println( bil + i );
    }
}

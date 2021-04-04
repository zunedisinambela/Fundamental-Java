import java.util.Scanner;

public class Deret2 {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int bil = 0;

        while ( bil < n ) {
            System.out.println( bil + i );
            bil += i;
            i += 1;
        }
    }
}

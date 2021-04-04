import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int bil = 0;

        while ( true ) {
            bil += i;
            if ( bil > n )
                break; // keluar dari while
            System.out.println(bil);
            i += 1;
        }
    }
}

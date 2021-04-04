import java.util.Scanner;

public class Selang {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        while ( i <= n ) {
            System.out.println(i);
            i += 2;
        }
    }
}

import java.util.Scanner;

public class Turun {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = n;
        while ( i > 0 ) {
            System.out.println(i);
            i--;
        }
    }
}

import java.util.Scanner;

public class urutTurun {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for ( int i = n; i > 0; i--)
            System.out.println(i);
    }
}

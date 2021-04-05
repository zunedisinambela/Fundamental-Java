import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat (n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for ( int i = 1; i <= n; i++)
            System.out.println(i);
    }
}

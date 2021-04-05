import java.util.Scanner;

public class Segita {
    public static void main(String[] args) {
        System.out.print("Tinggi Segitiga: ");
        Scanner scan = new Scanner(System.in);
        int tinggi = scan.nextInt();

        for ( int i = 1; i <= tinggi; i++) {
            for ( int j = 1; j <= i; j++)
                System.out.printf("%2d", j);

            System.out.println(); // Pindah Baris
        }
    }
}
